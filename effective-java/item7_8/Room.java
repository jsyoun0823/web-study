import java.lang.ref.Cleaner;

public class Room implements AutoCloseable{

    private static final Cleaner cleaner = Cleaner.create();

    // 청소가 필요한 자원. 절대 Room을 참조해서는 안 된다!
        // Room 인스턴스를 참조할 경우 순환참조가 생겨 가비지 컬렉터가 Room 인스턴스를 회수하지 않는다.
    private static class State implements Runnable {
        int numJunkPiles; // 방 안의 쓰레기 수

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        /**
            run 메서드가 호출되는 상황
                1. Room의 close 메서드를 호출할 때. close 메서드에서 Cleanable의 clean을 호출하면
                    이 메서드 안에서 run을 호출
                2. 가비지 컬렉터가 Room을 회수할 때까지 클라이언트가 close를 호출하지 않는다면,
                    cleaner가 State의 run을 호출
         */
        @Override
        public void run() {
            System.out.println("방 청소");
            numJunkPiles = 0;
        }
    }

    // 방의 상태. cleanable과 공유한다.
    private final State state;

    // cleanable 객체. 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() {
        cleanable.clean();
    }

}

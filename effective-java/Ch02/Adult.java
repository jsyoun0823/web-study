public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        }

        /**
         * Room 생성을 try-with-resources 블록으로 감쌌다면 자동 청소는 필요하지 않다.
         * 이 프로그램은 "안녕~" 을 출력한 후, "방 청소"를 출력한다.
         * */
    }
}

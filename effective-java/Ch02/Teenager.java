public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("아무렴");
        // System.gc(); // 종료 전에 "방 청소" 가 출력된다.
    }

    /**
        'System.exit를 호출할 때의 cleaner의 동작은 구현하기 나름이다.
        청소가 이뤄질지는 보장하지 않는다'고 명시되어 있기 때문에
        "방 청소" 를 출력하지 않는다.
     * */
}

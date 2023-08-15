package item17;

public class StringExample {

    public static void main(String[] args) {
        String name = "whiteship";

        StringBuilder nameBuilder = new StringBuilder(name);
        nameBuilder.append("keesun");
        // Builder가 가지고 있는 내부 값에 추가를 하는 것. 새로운 인스턴스 X
        // -> 가변 동반 클래스
    }
}
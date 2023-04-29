package item04;

/**

 정적 메서드만 담은 유틸리티 클래스는 인스턴스로 만들어 쓰려고 설계한 클래스가 아니다.

    # 유틸리티 클래스란?
        - 인스턴스 메서드와 인스턴스 변수를 제공하지 않고 정적 메서드와 변수만을 제공하는 클래스
        - 비슷한 기능의 메서드와 상수를 모아서 캡슐화한 것

 abstract를 붙여 추상 클래스로 만들면 상속이 가능->인스턴스화 막을 수 없음

 private 생성자 추가하면 막을 수 있다. (상속도 방지 가능)

 */
public class UtilityClass {

    /**
     * 이 클래스는 인스턴스를 만들 수 없습니다.
     * */
    private UtilityClass() {
        throw new AssertionError();
    }

    public static String hello() {
        return "hello";
    }

    public static void main(String[] args) {
        String hello = UtilityClass.hello();

        UtilityClass utilityClass = new UtilityClass();
        utilityClass.hello();
        // => 에러발생
    }
}
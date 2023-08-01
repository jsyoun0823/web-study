package item15;

import java.util.Arrays;

class DefaultMemberService implements MemberService{

    private String name;

    // 이렇게 memberRepository가 해당 클래스에서만 쓰인다면?

    /*
    MemberRepository memberRepository;

    public Member getMember() {
        memberRepository.findById();
        return null;
    }
     */

    // 해당 클래스를 따로 둘 게 아니라 이 안에 private static으로 중첩하자!

    // static 으로 선언하면, Inner class는 외부 클래스를 참조하고 있지 않다.
    private static class PrivateStaticClass {
        void doPrint() {
//            System.out.println(name); // static은 불가능!
        }
    }

    private class PrivateClass {
        void doPrint() {
            System.out.println(name); // Inner Class에서 외부 클래스의 필드를 자유롭게 사용 가능
        }
    }

    // private class는 Inner CLass를 감싸고 있는 외부 인터페이스를 참조하는 필드가 자동으로 생긴다.
    // static class는 Inner class지만, 남이나 마찬가지다. 외부 클래스에 대한 아무런 참조가 없다.

    // 현재 상황을 보면, 원래 InnerClass가 바깥에 존재 했고 독립적인 경우라면 private static이 어울린다.

    public static void main(String[] args) {
        Arrays.stream(PrivateClass.class.getDeclaredFields()).forEach(System.out::println);
        // => 출력해보면 DefulatMemberService 필드도 나온다.
    }
}
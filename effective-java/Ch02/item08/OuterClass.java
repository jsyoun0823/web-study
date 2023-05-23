package item08;

import java.lang.reflect.Field;

public class OuterClass {

    private void hi() {

    }

    // Outerclass 에 종속적 -> outerClass 거쳐서만 생성 가능
    class InnerClass {
        public void hello() {
            // OuterClass의 메소드를 사용하는 방법
            // 정적이 아닌 중첩 클래스는 자동으로 바깥 객체의 참조를 갖는다.
            // -> 따라서 cleaner를 만들 때는 무한 순환 참조가 일어날 수 있으니 static으로 선언해야 한다.
            OuterClass.this.hi();
        }
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(innerClass);

        outerClass.printField();
    }

    private void printField() {
        Field[] declaredFields = InnerClass.class.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("field type:" + field.getType());
            System.out.println("field name:" + field.getName());
        }
    }

}
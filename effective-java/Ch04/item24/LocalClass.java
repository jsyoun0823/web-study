package item24;

public class LocalClass {
    public void outer() {
        class innerClass {
            void hello() {
                System.out.println("hello");
            }
        }
    }
}
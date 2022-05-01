package item24;

public class OuterClass {

    public void test() { }

    class InnerClass {

        void access() {
            OuterClass.this.test();
        }
    }
}
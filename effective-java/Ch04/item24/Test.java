package item24;

public class Test {
    interface Insect {
        void attack();
    }

    Insect spider() {
        return new Insect() {
            @Override
            public void attack() {
                System.out.println("얍");
            }
        };
    }
}
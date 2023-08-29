package item20;

public class MyCat extends AbstractCat implements Flyable{

    private  MyFlyable myFlyable = new MyFlyable();

    @Override
    protected String sound() {
        return "야옹";
    }

    @Override
    protected String name() {
        return "유미";
    }

    public static void main(String[] args) {
        MyCat myCat = new MyCat();

        System.out.println(myCat.sound());
        myCat.fly();
    }

    @Override
    public void fly() {
        this.myFlyable.fly();
    }

    private class MyFlyable extends AbstactFlyable {
        @Override
        public void fly() {
            System.out.println("날아라");
        }
    }
}
public class Yum {

    public Yum() {}

    public Yum(Yum yum) {
        // ...
    }

    public static Yum newInstance(Yum yum) {
        Yum newYum = new Yum();
        // ...
        return newYum;
    }
}
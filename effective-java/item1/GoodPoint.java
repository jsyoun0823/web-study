public class GoodPoint extends Point {
    public GoodPoint(int x, int y) {
        super(x, y);
    }

    public static Point newPoint() {
        return new GoodPoint(10, 10);
    }
}

public class BadPoint extends Point{
    public BadPoint(int x, int y) {
        super(x, y);
    }

    public static BadPoint newPoint() {
        return new BadPoint(1, 1);
    }
}

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
    }

    public static Point newPoint(int score) {
        if(score > 0) {
            return GoodPoint.newPoint();
        } else {
            return BadPoint.newPoint();
        }
    }
}

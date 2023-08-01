package item14;

public class Point implements Comparable<Point>{
    final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(Point o) {
        int result = Integer.compare(x, y);
        if (result == 0) {
            result = Integer.compare(x, y);
        }
        return result;
    }
}
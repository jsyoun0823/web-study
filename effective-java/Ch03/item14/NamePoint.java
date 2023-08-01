package item14;

import java.util.Comparator;
import java.util.TreeSet;

public class NamePoint extends Point{

    final private String name;

    public NamePoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }

    @Override
    public String toString() {
        return "NamePoint{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        NamePoint p1 = new NamePoint(1, 0, "apple");
        NamePoint p2 = new NamePoint(1, 0, "pizza");

        // 추천하지 않는 방법
        TreeSet<NamePoint> points = new TreeSet<>(new Comparator<NamePoint>() {
            @Override
            public int compare(NamePoint o1, NamePoint o2) {
                int result = Integer.compare(o1.getX(), o2.getX());
                if (result == 0) {
                    result = Integer.compare(o1.getX(), o2.getX());
                }
                if(result == 0) {
                    result = o1.name.compareTo(o2.name);
                }
                return result;
            }
        });

        points.add(p1);
        points.add(p2);
    }

}
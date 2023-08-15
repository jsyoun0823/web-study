package item17;

import item16.Point;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class BigIntExample {

    public static void main(String[] args) {
        BigInteger ten = BigInteger.TEN;
        BigInteger minusTen = ten.negate();

        final Set<Point> points = new HashSet<>();
        Point firstPoint = new Point(1, 2);
        points.add(firstPoint);
        // 담고있는 값들이 달라지는 것은 막을 수 없다.
        firstPoint.setX(10);

        // 따라서 불변 객체들을 구성요소로 사용하면 할수록 더 좋다.
    }
}
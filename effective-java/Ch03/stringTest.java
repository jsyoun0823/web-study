import java.awt.*;

public class stringTest {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
        String s = "polish";
//
//        System.out.println(cis.equals(s));
//        System.out.println(s.equals(cis));

        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);

//        System.out.println(p.equals(cp));
//        System.out.println(cp.equals(p));

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);

//        System.out.println(p1.equals(p2)); // true
//        System.out.println(p2.equals(p3)); // true
//        System.out.println(p1.equals(p3)); // false


    }
}
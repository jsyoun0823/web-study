public class IntegerExample {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b); // true

        Integer c = new Integer(5);
        Integer d =new Integer(5);
        System.out.println(c == d); // false
        System.out.println(c.equals(d)); // true

        Integer e = 200;
        Integer f = 200;
        System.out.println(e == f); // false
    }
}
public class WeightTable {
    public static void main(String[] args) {
//        double earthWeight = Double.parseDouble(args[0]);
//        double mass = earthWeight / Planet.MERCURY.surfaceGravity();
//        for (Planet p : Planet.values())
//            System.out.printf("%s에서의 무게는 %f이다.%n",
//                            p, p.surfaceWeight(mass));

        double x = 2;
        double y = 4;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                                x, op, y, op.apply(x, y));
    }
}
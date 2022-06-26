package item38;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        double x = 4;
        double y = 2;
//        test(ExtendedOperation.class, x, y); // 첫 번째 방법
        test2(Arrays.asList(ExtendedOperation.values()), x, y);

    }

    private static void test2(Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }

    private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
        for(Operation op : opEnumType.getEnumConstants()) {
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
        }
    }
}
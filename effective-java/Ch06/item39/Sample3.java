package item39;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {

    @ExceptionTest(IndexOutOfBoundsException.class)
    @ExceptionTest(NullPointerException.class)
    public static void doublyBad() {
        List<String> list = new ArrayList<>();
        list.addAll(5, null); // NullPointerException을 던질 수 있다.
    }
}
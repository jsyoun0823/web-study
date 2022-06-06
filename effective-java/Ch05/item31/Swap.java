package item31;

import java.util.List;

public class Swap {
//    public static <E> void swap(List<E> list, int i, int j);
    public static void swap(List<?> list, int i, int j){
        swapHelper(list, i, j);
    }

    private static <E> void swapHelper(List<E> list, int i, int j) {
        list.set(i, list.set(j, list.get(i)));
    }
}
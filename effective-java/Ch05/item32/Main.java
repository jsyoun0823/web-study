package item32;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public void variable(String ... s) {
        System.out.println(s);
    }

    static void dangerous(List<String> ... stringLists) {
        List<Integer> intList = List.of(42);
        Object[] objects = stringLists;
        objects[0] = intList;               // 힙 오염 발생
        String s = stringLists[0].get(0);   // ClassCastException
    }


    static <T> List<T> flattern(List<List<? extends T>> lists) {
        List<T> result = new ArrayList<>();
        for (List<? extends T> list : lists)
            result.addAll(list);
        return result;
    }
}
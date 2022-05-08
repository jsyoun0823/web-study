package item28;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] objectArray = new Long[1];
        objectArray[0] = "타입이 달라 넣을 수 없다."; // ArrayStoreException 을 던진다.

//        List<Object> ol = new ArrayList<Long>(); // 호환되지 않는 타입이다.
//        ol.add("타입이 달라 넣을 수 없다.");

//        List<String>[] stringLists = new List<String>[1];   // (1)
//        List<Integer> intList = List.of(42);                // (2)
//        Object[] objects = stringLists;                     // (3)
//        objects[0] = intList;                               // (4)
//        String s = stringLists[0].get(0);                   // (5)

    }
}
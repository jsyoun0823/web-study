package item26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class Main {
//    private final Collection stamps = ...;
//    stamps.add(new Coin()); // "unchecked call" 경고를 뱉는다.


//    private final Collection<Stamp> stamps = ...;

    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//
//        unsafeAdd(strings, Integer.valueOf(42));
//        String s = strings.get(0); // 컴파일러가 자동으로 형변환 코드를 넣어준다.
//    }
//
//    private static void unsafeAdd(List<Object> list, Object o) {
//        list.add(o);

//        if(o instanceof Set) {          // 로 타입
//            Set<?> s = (Set<?>) o;      // 와일드카드 타입
//            ...
//        }
    }

    static int numElementsInCommon(Set<?> s1, Set<?> s2) {
        int result = 0;
        for (Object o1 : s1) {
            if (s2.contains(o1))
                result++;
        }
        return result;
    }
}
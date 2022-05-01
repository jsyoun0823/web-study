package item21;

import java.util.Collection;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> match = s -> s.length() > 10;
        System.out.println(match.test("안녕하세요")?"긴 문장":"짧은 문장");


    }
}
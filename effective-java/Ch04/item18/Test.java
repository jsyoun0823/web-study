package item18;

import java.time.Instant;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "탁탁", "펑"));
        System.out.println(s.getAddCount());
    }

    static void walk(Set<Dog> dogs) {
        InstrumentedSet<Dog> iDogs = new InstrumentedSet<>(dogs);
    }
}
import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

public class OrdinalTest {
    public void useOrdinal() {
        Set<Plant>[] planeByLifeCycle =
                (Set<Plant>[]) new Set[Plant.LifeCycle.values().length];

        for (int i = 0; i < planeByLifeCycle.length; i++) {
            planeByLifeCycle[i] = new HashSet<>();
        }

//        for (Plant p : garden)
//            planeByLifeCycle[p.lifeCycle.ordinal()].add(p);

        for (int i = 0; i < planeByLifeCycle.length; i++) {
            System.out.printf("%s: %s%n",
                    Plant.LifeCycle.values()[i], planeByLifeCycle[i]);
        }
    }

    public void useEnumMap() {
        Map<Plant.LifeCycle, Set<Plant>> plantByLifeCycle =
                new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantByLifeCycle.put(lc, new HashSet<>());

//        for (Plant p : garden)
//            plantByLifeCycle.get(p.lifeCycle).add(p);

        System.out.println(plantByLifeCycle);
    }

    public void useStream() {
//        System.out.println(Arrays.stream(garden)
//                .collect(groupingBy(p -> p.lifeCycle)));


//        System.out.println(Arrays.stream(garden)
//                .collect(groupingBy(p -> p.lifeCycle,
//                        () -> new EnumMap<> (Plant.LifeCycle.class), toSet())));
    }
}
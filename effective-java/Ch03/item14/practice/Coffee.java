package item14.practice;

import java.util.Comparator;

public class Coffee implements Comparable<Coffee>{

    String name;

    public Coffee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static final Comparator<Coffee> COMPARATOR =
            Comparator.comparing(Coffee::getName);

//    @Override
//    public int compareTo(Coffee o) {
//        int result = this.name.compareTo(o.name);
//        return result;
//    }

    public int compareTo(Coffee c) {
        return COMPARATOR.compare(this, c);
    }
}
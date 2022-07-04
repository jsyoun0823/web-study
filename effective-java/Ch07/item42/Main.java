package item42;

import java.util.*;

import static java.util.Comparator.comparingInt;

public class Main {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("a", "bb", "c");

        Collections.sort(word, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        Collections.sort(word, (s1 , s2) -> Integer.compare(s1.length(), s2.length()));

        Collections.sort(word, comparingInt(String::length));

        word.sort(comparingInt(String::length));
    }
}
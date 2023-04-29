package item05.staticutils;

import item05.DefaultDictionary;
import item05.Dictionary;

import java.util.List;

/**
 자원을 직접 명시하는 방식
 * */
public class SpellChecker {

    private static final Dictionary dictionary = new DefaultDictionary();

    private SpellChecker() {};

    public static boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public static List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
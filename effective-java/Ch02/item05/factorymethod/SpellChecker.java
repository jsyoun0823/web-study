package item05.factorymethod;

import item05.Dictionary;

import java.util.List;

public class SpellChecker {

    private Dictionary dictionary; // Produc Interface

    public SpellChecker(DictionaryFactory dictionaryFactory) {
        this.dictionary = dictionaryFactory.getDictionary();
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
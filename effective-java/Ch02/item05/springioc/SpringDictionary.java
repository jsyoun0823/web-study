package item05.springioc;

import item05.Dictionary;

import java.util.List;

public class SpringDictionary implements Dictionary {
    @Override
    public boolean contains(String word) {
        return false;
    }

    @Override
    public List<String> closeWordsTo(String typo) {
        return null;
    }
}
package item05.factorymethod;

import item05.DefaultDictionary;
import item05.Dictionary;

public class DefaultDictionaryFactory implements DictionaryFactory{

    @Override
    public Dictionary getDictionary() {
        return new DefaultDictionary();
    }
}
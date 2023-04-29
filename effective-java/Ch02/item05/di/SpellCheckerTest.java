package item05.di;

import item05.DefaultDictionary;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
        spellChecker.isValid("test");
    }

    @Test
    void isValidSupplier() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
        spellChecker.isValid("test");
    }

}
package item05.di;

import item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

    // 생성자에 자원 팩터리를 넘겨주는 방식
    // Supplier가 팩터리를 표현한 완벽한 예시
//    public SpellChecker(Supplier<Dictionary> dictionarySupplier) {
//        this.dictionary = dictionarySupplier.get();
//    }

    // 한정적 와일드카드 타입을 사용해 팩터리의 타입 매개변수를 제한
    // Dictionary를 상속한 하위 타입도 받을 수 있다.
    public SpellChecker(Supplier<? extends Dictionary> dictionarySupplier) {
        this.dictionary = dictionarySupplier.get();
    }


    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.closeWordsTo(typo);
    }
}
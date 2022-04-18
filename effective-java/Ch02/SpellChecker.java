import java.util.Objects;

// 정적 유틸리티를 잘못 사용한 예
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

//    private static final Lexicon dictionary = new Lexicon();
//
//    private SpellChecker() {}; // 객체 생성 방지
}

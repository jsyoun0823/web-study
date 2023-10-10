package item30;

import java.util.function.UnaryOperator;

// 제네릭 싱글턴 패턴
public class UnaryOperatorTest {

    // 항등함수
    private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

    /* 제네릭 싱글턴 팩터리 */
    @SuppressWarnings("unchecked")
    public static <T> UnaryOperator<T> identityFunction() {
        return (UnaryOperator<T>) IDENTITY_FN;
    }

    public static void main(String[] args) {
        String[] strings = {"삼베", "대마", "나일론"};
        UnaryOperator<String> sameString = identityFunction();
        // 컴파일러가 String으로 형변환 해주는 코드를 자동으로 넣어줘서 우리가 쓸 필요가 없다.
        for (String s : strings) {
            System.out.println(sameString.apply(s));
        }

        Number[] numbers = {1, 2.0, 3L};
        UnaryOperator<Number> sameNumber = identityFunction();
        for (Number n : numbers) {
            System.out.println(sameNumber.apply(n));
        }
    }
}
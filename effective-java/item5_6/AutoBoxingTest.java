public class AutoBoxingTest {
    private static long sum() {
       Long sum = 0L; // long을 Long으로 쓰게 되면 불필요한 인스턴스가 2^31 개나 생긴다.

       for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
       }

       return sum;
    }

}

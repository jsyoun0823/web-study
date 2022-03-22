import java.time.Duration;

public class MovieTest {
    public static void main(String[] args) {
        Movie starWars = new Movie("스타워즈",
                Duration.ofMinutes(210),
                Money.wons(10000),
                new NoneDiscountPolicy());
    }
}

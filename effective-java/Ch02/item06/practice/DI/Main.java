package item06.practice.DI;

public class Main {
    public static void main(String[] args) {
        Coffee brazilCoffee = new Coffee(BrazilBean::new);
    }
}
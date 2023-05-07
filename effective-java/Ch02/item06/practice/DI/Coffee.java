package item06.practice.DI;

import java.util.function.Supplier;

public class Coffee{

    private CoffeeBeans coffeeBeans;

    public Coffee(Supplier<? extends CoffeeBeans> coffeebeansSupplier) {
        this.coffeeBeans = coffeebeansSupplier.get();
    }
}
package item05.practice;

import java.util.List;
import java.util.function.Supplier;

public class AdvancedCoffeeMachine implements CoffeeMachine{

    private List<Coffee> coffees;

    public AdvancedCoffeeMachine(List<Coffee> coffees) {
        this.coffees = coffees;
    }

//    public AdvancedCoffeeMachine(Supplier<List<Coffee>> coffeeSupplier) {
//        this.coffees.add(coffeeSupplier.get());
//        this.coffees = coffeeSupplier.get();
//    }

    @Override
    public void makeCoffee(Coffee coffee) {
        System.out.println("맛있는 " + coffee.name() + " 나왔어요~ " + coffee.getPrice() + "원 입니다.");
    }
}
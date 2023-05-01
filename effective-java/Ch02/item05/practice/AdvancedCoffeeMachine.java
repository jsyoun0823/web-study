package item05.practice;

import java.util.List;

public class AdvancedCoffeeMachine implements CoffeeMachine{

    private List<Coffee> coffees;

    public AdvancedCoffeeMachine(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public void makeCoffee(Coffee coffee) {
        System.out.println("맛있는 커피 나왔어요~");
    }
}
package item05.practice;

import java.util.List;

public class SimpleCoffeeMachine implements CoffeeMachine{

    private List<Coffee> coffees;

    public SimpleCoffeeMachine(List<Coffee> coffees) {
        this.coffees = coffees;
    }

    @Override
    public void makeCoffee(Coffee coffee) {

        if(!coffees.contains(coffee)) {
            throw new AssertionError("없는 커피입니다");
        }

        System.out.println("커피 나왔어요~");
    }
}
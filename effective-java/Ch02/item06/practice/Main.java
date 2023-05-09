package item06.practice;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = CoffeeMachine.getCoffeeMachine();
        Coffee coffee = coffeeMachine.makeCoffee(CoffeeBeans.브라질);

        System.out.println(coffee.getClass());

        coffeeMachine.blend();
    }
}
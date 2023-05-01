package item05.practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine simpleMachine = new SimpleCoffeeMachine(Arrays.asList(Coffee.Americano, Coffee.cafemocha, Coffee.latte));
        CoffeeMachineService simpleMachineService = new CoffeeMachineService(simpleMachine);

        simpleMachineService.makeCoffee(Coffee.Americano);
        simpleMachineService.makeCoffee(Coffee.herbtea);

    }
}
package item05.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine simpleMachine = new SimpleCoffeeMachine(Arrays.asList(Coffee.Americano, Coffee.cafemocha, Coffee.latte));
        CoffeeMachineService simpleMachineService = new CoffeeMachineService(simpleMachine);

        simpleMachineService.makeCoffee(Coffee.Americano);
//        simpleMachineService.makeCoffee(Coffee.herbtea);


        Supplier<List<Coffee>> advancedMachine = () -> Arrays.asList(Coffee.Americano, Coffee.cafemocha);
//        Supplier<List<Coffee>> advancedMachine = () -> new AdvancedCoffeeMachine(coffees);
//        CoffeeMachine advancedMachine = new AdvancedCoffeeMachine(Coffee.Americano);
        CoffeeMachineService advancedMachineService = new CoffeeMachineService((CoffeeMachine) advancedMachine);

        advancedMachineService.makeCoffee(Coffee.herbtea);
    }
}
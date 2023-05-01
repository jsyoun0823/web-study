package item05.practice;

public class CoffeeMachineService {

    private CoffeeMachine coffeeMachine;

    public CoffeeMachineService(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee(Coffee coffee) {
        coffeeMachine.makeCoffee(coffee);
    }
}
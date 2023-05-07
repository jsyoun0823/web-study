package item06.practice;

public class CoffeeMachine {

    private static CoffeeMachine coffeeMachine;

    private CoffeeMachine() {};

    public static CoffeeMachine getCoffeeMachine() {
        if(coffeeMachine == null)
            coffeeMachine = new CoffeeMachine();

        return coffeeMachine;
    }

    public Coffee makeCoffee(CoffeeBeans coffeeBeans) {

        if(coffeeBeans.equals(CoffeeBeans.아라비카)) {
            return new ArabicaCoffee();
        } else if (coffeeBeans.equals(CoffeeBeans.브라질)){
            return new BrazilCoffee();
        }

        throw new IllegalArgumentException("없는 원두입니다.");
    }
}
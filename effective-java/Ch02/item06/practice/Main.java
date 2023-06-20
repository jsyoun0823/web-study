package item06.practice;

import item11.CoffeeMenu;

public class Main {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = CoffeeMachine.getCoffeeMachine();
        Coffee coffee = coffeeMachine.makeCoffee(CoffeeBeans.브라질);

        System.out.println(coffee.getClass());

        coffeeMachine.blend();

        CoffeeMenu coffeeMenu = new CoffeeMenu(coffee, 3000);
        System.out.println(coffeeMenu);

        CoffeeMenu coffeeMenu2 = new CoffeeMenu(coffee, 32523);
        System.out.println(coffeeMenu2);

        CoffeeMenu coffeeMenu3 = new CoffeeMenu(coffee, 3000);
        System.out.println(coffeeMenu3);
    }
}
package item02;

import item02.Calzone;
import item02.NyPizza;
import item02.Pizza;

public class BuilderTest {
    public static void main(String[] args) {
        NutritionFacts cola = new NutritionFacts.Builder(240, 8)
                .calories(100).fat(27).build();

        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION).build();
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println(pizza.toppings);

        pizza.toppings.add(Pizza.Topping.HAM);
//        pizza.toppings.add(POISON);

        System.out.println(pizza.toppings);


    }
}

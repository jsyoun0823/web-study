package item11;

import item06.practice.Coffee;

import java.util.Objects;

public class CoffeeMenu {
    private final Coffee coffeeName;
    private final int price;


    public CoffeeMenu(Coffee coffeeName, int price) {
        this.coffeeName = coffeeName;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof CoffeeMenu))
            return false;

        CoffeeMenu menu = (CoffeeMenu) o;
        return price == menu.price && Objects.equals(coffeeName, menu.coffeeName);
    }

    private volatile int hashCode;

    @Override
    public int hashCode() {
        if(this.hashCode != 0) {
            return hashCode;
        }

        synchronized (this) {
            int result = hashCode;
            if (result == 0) {
                result = coffeeName.hashCode();
                result = 31 * result + Integer.hashCode(price);
                this.hashCode = result;
            }
            return result;
        }
    }
}
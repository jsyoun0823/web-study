package item14.practice;

import java.util.TreeSet;

public class CoffeeMenu implements Comparable<CoffeeMenu>{
    private final Coffee coffee;
    private final int price;

    public CoffeeMenu(Coffee coffee, int price) {
        this.coffee = coffee;
        this.price = price;
    }

    @Override
    public int compareTo(CoffeeMenu o) {

        int result = this.coffee.compareTo(o.coffee);
        if(result == 0) {
            result = Integer.compare(this.price, o.price);
        }
        return result;

/*
        int result = Integer.compare(this.price, o.price);
        if(result == 0) {
            result = this.coffee.compareTo(o.coffee);
        }
        return result;
        */
    }

    public static void main(String[] args) {
        CoffeeMenu c1 = new CoffeeMenu(new Coffee("아메리카노"), 2000);
        CoffeeMenu c2 = new CoffeeMenu(new Coffee("콜드브루"), 2000);
        CoffeeMenu c3 = new CoffeeMenu(new Coffee("카페라떼"), 3500);
        CoffeeMenu c4 = new CoffeeMenu(new Coffee("아메리카노"), 2000);
        CoffeeMenu c5 = new CoffeeMenu(new Coffee("가나"), 1500);

        System.out.println(c1.compareTo(c1));
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c3));
        System.out.println(c1.compareTo(c4));
        System.out.println(c1.compareTo(c5));

        TreeSet<CoffeeMenu> menus = new TreeSet<>();
        menus.add(c1);
        menus.add(c2);
        menus.add(c3);
        menus.add(c5);

        for(CoffeeMenu c : menus) {
            System.out.println(c.coffee.name + " : " + c.price);
        }
    }
}
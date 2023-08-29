package item20.practice;

public class Main {
    public static void main(String[] args) {
        AbstactMaker coffeeMaker = new CoffeeMaker();
        System.out.println("커피 만들기");
        coffeeMaker.makeBeverage();

        System.out.println();

        AbstactMaker teaMaker = new TeaMaker();
        System.out.println("차 만들기");
        teaMaker.makeBeverage();
    }
}
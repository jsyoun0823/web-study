package item05.practice;

public enum Coffee {
    Americano(1500), latte(3000), cafemocha(3500), herbtea(3000);

    private int price;

    Coffee(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

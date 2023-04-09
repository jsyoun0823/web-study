package item01;

public enum OrderStatus {
    PREPARING(1), SHIPPED(2), DELIVERING(3);

    private int number;

    OrderStatus(int number) {
        this.number = number;
    }
}

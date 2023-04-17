package item02;

import java.time.LocalDate;

public class Order {
    public void updateDeliveryDate(LocalDate deliveryDate) throws IllegalArgumentException{
        if (deliveryDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("deliveryDate con't be earlier than " + LocalDate.now());
        }
    }
}
package item02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));

            return self();
            // this 가 아닌 self()를 반환해야 한다.
            //  -> 하위클래스에 있는 Builder들은 자기 자신을 return해야 한다.
            //  -> 하위타입인 T타입을 return할 수 있게끔 self()를 사용한 것.
        }

        abstract Pizza build();

        // 하위 클래스는 이 메서드를 재정의(overring)하여 "this"를 반환하도록 해야한다.
        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

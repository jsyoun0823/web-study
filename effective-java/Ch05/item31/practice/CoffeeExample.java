package item31.practice;

import java.util.ArrayList;
import java.util.List;

public class CoffeeExample {

    class Coffee {}
    class Espresso extends Coffee {}
    class Latte extends Coffee {}

    public void main(String[] args) {
        // Producer-Extends (extends를 사용하여 읽기만 가능한 리스트)
        List<? extends Coffee> producerList = new ArrayList<Espresso>();
        // 아래 줄은 에러가 발생합니다. producerList에는 어떤 종류의 커피가 있는지 정확하게 알 수 없기 때문에
        // producerList.add(new Espresso());
        // producerList.add(new Latte());

        // Consumer-Super (super를 사용하여 쓰기만 가능한 리스트)
        List<? super Coffee> consumerList = new ArrayList<Object>();
        consumerList.add(new Espresso());
        consumerList.add(new Latte());

        // 아래 줄은 에러가 발생합니다. consumerList에는 Coffee 및 그 상위 타입의 요소만 허용되기 때문에
        // Espresso espresso = consumerList.get(0);

        // Producer-Extends를 사용하여 읽기 예시
        List<Espresso> espressos = new ArrayList<>();
        espressos.add(new Espresso());
        List<? extends Coffee> coffeeList = espressos;
        Coffee coffee = coffeeList.get(0); // OK

        // Consumer-Super를 사용하여 쓰기 예시
        List<Object> objects = new ArrayList<>();
        List<? super Coffee> objectList = objects;
        objectList.add(new Latte()); // OK
    }
}

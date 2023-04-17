package item02;

import java.util.Arrays;

public class VaragsSamples {

    // 가변인수는 항상 마지막에 선언
    public void printNumbers(int... numbers) {
        System.out.println(numbers.getClass().getCanonicalName());  // 어떤 타입? => 배열
        System.out.println(numbers.getClass().getComponentType());  // 어떤 타입의 배열인지? => int
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VaragsSamples samples = new VaragsSamples();
        samples.printNumbers(1, 20, 20, 39, 59);
    }
}
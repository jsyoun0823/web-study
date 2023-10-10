package item29.bounded_type;

import java.io.Serializable;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<E extends Number & Serializable> {
    private Number[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    @SuppressWarnings("unchecked")
    public Stack() {
        elements = (E[]) new Number[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public E pop() {
        if (size == 0)
            throw new EmptyStackException();

        // push에서 E 타입만 허용하므로 이 형변환은 안전하다.
        @SuppressWarnings("unchecked")
        E result = (E) elements[--size];

        elements[size] = null;; // 다 쓴 참조 해제
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

    /*
        위 코드에서 <E extends Number> 를 붙였기 때문에 Number의 배열로 만들어진다.
        따라서 Runtime중에 Object의 배열을 Number의 배열로 바꾸려고 한다.
        아무거나의 배열을 Number의 배열로 바꾸는 것은 안전하지 않다.
        반대는 가능하다. 모든 Number는 Object를 상속한 것이니까, 공변이니까 괜찮다.

        따라서 E[] 가 아닌 Number[]의 배열로 만들어준다.
        대신 꺼낼 때 (E)만 붙여준다!

     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (Integer arg : List.of(1, 2,3)) {
            stack.push(arg);
        }
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
package Rectangle;

public class AnyClass {
    /**
     * 문제점
     * 1. 코드 중복
     * 2. 변경에 취약
     * */
    void anyMethod(Rectangle rectangle, int multiple) {
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setBottom(rectangle.getBottom() * multiple);
    }
}
package Rectangle;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private int left;
    private int top;
    private int right;
    private int bottom;

    public Rectangle(int left, int top, int right, int bottom) {
        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
    }

    // 캡슐화를 강화시키는 방법 ! 자신의 크기를 스스로 증가시키도록 책임을 이동
    public void enlarge(int multiple) {
        right *= multiple;
        bottom *= multiple;
    }
}
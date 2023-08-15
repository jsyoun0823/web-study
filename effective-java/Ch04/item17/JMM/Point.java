package item17.JMM;

public class Point {

    private int x;

    private int y;

    public Point() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        // 보통 생각하는 실행 순서
        // Object p = new Point()
        // p.x = 1
        // p.y = 2
        // point = p
        Point point = new Point();

        // 이렇게 실행할 수도 있다
        // Object p = new Point()
        // point = p
        // p.x = 1
        // p.y = 2

        // 이 때 다른 스레드에서 해당 Point 객체를 같이 사용한다면,
        // 실행 순서에 따라서 값이 바뀔 수도 있다.
        // ==> 불완전한 초기화
    }
}
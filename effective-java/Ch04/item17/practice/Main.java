package item17.practice;

public class Main {
    public static void main(String[] args) {
        CafeMembership membership1 = CafeMembership.valueOf(new Customer("jiseon", 26), 100);
        CafeMembership membership2 = CafeMembership.valueOf(new Customer("minwoo", 29), 50);

        // 초기 멤버십 포인트
        membership1.showPoints();
        membership2.showPoints();

        // 멤버십 포인트 추가 -> 새로운 객체 반환
        CafeMembership updatedMembership1 = membership1.addPoints(30);
        CafeMembership updatedMembership2 = membership2.addPoints(60);

        // 기존 멤버십은 바뀌지 않는다.
        membership1.showPoints();
        membership2.showPoints();

        // 만약 DB 연동되어 있으면 updatedMembership1을 저장하면 됨
        updatedMembership1.showPoints();
        updatedMembership2.showPoints();
    }
}
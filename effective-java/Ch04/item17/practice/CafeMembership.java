package item17.practice;

public class CafeMembership {
    private final Customer customer;
    private final int points;

    private CafeMembership(Customer customer, int points) {
        this.customer = customer;
        this.points = points;
    }

    public static CafeMembership valueOf(Customer customer, int points) {
        return new CafeMembership(customer, points);
    }

    public void showPoints() {
        System.out.println(customer.getName() + "님의 현재 포인트는 " + this.points + "점 입니다.");
    }

    public CafeMembership addPoints(int pointsToAdd) {
        return new CafeMembership(customer, points + pointsToAdd);
    }

    private static class CafeVIPMembership extends CafeMembership {
        private CafeVIPMembership(Customer customer, int points) {
            super(customer, points);
        }
    }
}
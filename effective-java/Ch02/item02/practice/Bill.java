package item02.practice;

public class Bill {
    private final String billNo;
    private final int totalAmt;
    private final PaymentUser paymentUser;
    private final int nopIncoAmt;
    private final int point;

    public static class Builder {
        private final String billNo;
        private final int totalAmt;
        private final PaymentUser paymentUser;

        private int nopIncoAmt = 0;
        private int point = 0;

        public Builder(String billNo, int totalAmt, PaymentUser paymentUser) {
            this.billNo = billNo;
            this.totalAmt = totalAmt;
            this.paymentUser = paymentUser;
        }

        public Builder nopIncoAmt(int val) {
            nopIncoAmt = val;
            return this;
        }

        public Builder point(int val) {
            point = val;
            return this;
        }

        public Bill build() {
            return new Bill(this);
        }
    }

    private Bill(Builder builder) {
        billNo = builder.billNo;
        totalAmt = builder.totalAmt;
        paymentUser = builder.paymentUser;
        nopIncoAmt = builder.nopIncoAmt;
        point = builder.point;
    }
}
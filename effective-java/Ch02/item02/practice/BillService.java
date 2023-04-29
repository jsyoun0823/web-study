package item02.practice;

public class BillService {
    public static void main(String[] args) {
        PaymentUser paymentUser = new CmsPaymentUser.Builder(23171)
                .bankCd(1234)
                .build();

        System.out.println(paymentUser.stmtCds);

        Bill DirectBill = new Bill.Builder("202304170001", 400000, paymentUser)
                .point(5000)
                .build();

        Bill NopIncoBill = new Bill.Builder("202304270002", 560000, paymentUser)
                .nopIncoAmt(200000)
                .build();

    }
}
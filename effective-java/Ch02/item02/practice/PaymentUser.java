package item02.practice;

import java.util.EnumSet;
import java.util.Objects;

public abstract class PaymentUser {

    public enum StmtCd {CMS, 카드정기결제, 가상계좌입금}
    final EnumSet<StmtCd> stmtCds;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<StmtCd> stmtCds = EnumSet.noneOf(StmtCd.class);

        protected T addStmtCd(StmtCd stmtCd) {
            stmtCds.add(Objects.requireNonNull(stmtCd));
            return self();
        }

        abstract PaymentUser build();

        protected abstract T self();
    }

    PaymentUser(Builder<?> builder) {
        stmtCds = builder.stmtCds.clone();
    }
}
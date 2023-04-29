package item02.practice;

import java.util.Objects;

public class CmsPaymentUser extends PaymentUser{
    private final int CmsId;
    private final int bankCd;

    public static class Builder extends PaymentUser.Builder<Builder> {
        private int CmsId;
        private int bankCd = 0;

        public Builder(int cmsId) {

            this.CmsId = Objects.requireNonNull(cmsId);
            this.addStmtCd(StmtCd.CMS);
        }

        public Builder bankCd(int cd) {
            bankCd = cd;
            return this;
        }

        @Override
        public CmsPaymentUser build() {
            return new CmsPaymentUser(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private CmsPaymentUser(Builder builder) {
        super(builder);
        CmsId = builder.CmsId;
        bankCd = builder.bankCd;
    }
}
package item08.finalizerAttack;

import java.math.BigDecimal;

public class Account {

    private String accountId;

    public Account(String accountId) {
        this.accountId = accountId;

        if (accountId.equals("푸틴")) {
            throw new IllegalArgumentException("푸틴은 계정을 막습니다.");
        }
    }

    public void transfer(BigDecimal amount, String to) {
        System.out.printf("transfer %f from %s to %s\n", amount, accountId, to);
    }

    @Override
    protected final void finalize() throws Throwable {
    }
}

// 1. 상속 불가능하게 fianl 선언
// 2. 여기서 finalizer 오버라이딩 하고 아무것도 하지 못하도록 하고, final 붙임
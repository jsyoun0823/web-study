package item08.finalizerAttack;

import java.math.BigDecimal;

public class BrokenAccount extends Account{

    public BrokenAccount(String accountId) {
        super(accountId);
    }

//    @Override
//    protected void finalize() throws Throwable {
//        this.transfer(BigDecimal.valueOf(1000000000), "jiseon");
//    }
}
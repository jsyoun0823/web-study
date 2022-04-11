package Sreening;

import java.time.Duration;
import java.util.List;

public class NoneDiscountMoive extends Movie{

    public NoneDiscountMoive(String title, Duration runningTime, Money fee) {
        super(title, runningTime, fee);
    }

    @Override
    protected Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
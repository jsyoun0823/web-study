package Sreening;

public interface DiscountCondition {

    // 인자로 전달된 screening이 할인이 가능한 경우 true를 반환하고, 불가능한 경우 false 반환
    boolean isSatisfiedBy(Screening screening);
}

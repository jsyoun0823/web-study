package Sreening;

/* 할인 조건 중 순번 조건  */
public class SequenceCondition implements DiscountCondition{
    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    // 파라미터로 전달된 Screening의 상영 순번과 일치할 경우 할인 가능하다.
    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }
}

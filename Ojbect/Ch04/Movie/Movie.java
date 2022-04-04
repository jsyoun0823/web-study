package Movie;

import Sreening.Money;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.util.List;

@Getter
@Setter
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;

    /* 할인 조건의 목록이 인스턴스 변수로 Movie안에 직접 포함되어 있음 */
    private List<DiscountCondition> discoutConditions;

    private MovieType movieType;
    private Money discountAmount;
    private double discountPercent;

    // 캡슐화 위반
    public Money getFee() {
        return fee;
    }
}
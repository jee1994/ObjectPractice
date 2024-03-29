package chapter2;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountpolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountpolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountpolicy = discountpolicy;
    }

    public Money getFee() {
        return fee;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountpolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        if (discountpolicy == null) {
            return fee;
        }

        return fee.minus(discountpolicy.calculateDiscountAmount(screening));
    }
}

package chapter2;

public class NoneDiscountPolicy implements DiscountPolicy {
    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO
    }
}

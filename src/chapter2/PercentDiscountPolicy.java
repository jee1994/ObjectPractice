package chapter2;

public class PercentDiscountPolicy implements DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition .. conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}

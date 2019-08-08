package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface DiscountPolicy {
    private List<DiscountCondition> conditions = new ArrayList<>();

    Money calculateDiscountAmount(Screening screening);
}

package design.solid.solution;

public class VipDP implements DiscountPolicy{
    @Override
    public int calc(int total) {
        return (int) (total - total * 0.2);
    }
}

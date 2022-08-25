package design.solid.v2;

public abstract class Member{
    private double discountRate;

    public Member(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}

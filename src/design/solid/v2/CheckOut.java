package design.solid.v2;

public class CheckOut {

    private int totalPrice = 50000;
    private Member member;

    public CheckOut(Member member) {
        this.member = member;
    }

    public void calcDiscount() {
        System.out.printf("총 금액은 %d 입니다.\n", totalPrice);
        this.totalPrice = totalPrice - (int)(totalPrice * member.getDiscountRate());
        System.out.printf("먬버십 할인 적용된 금액은 %d 입니다.\n", totalPrice);
    }

}

package design.solid.v1;

public class CheckOut {

    private int totalPrice = 50000;
    private String memberType;

    public CheckOut(String memberType) {
        this.memberType = memberType;
    }

    public void calcDiscount() {
        System.out.printf("총 금액은 %d 입니다.\n", totalPrice);
        this.totalPrice = totalPrice - (int)(totalPrice * getDiscountRate());
        System.out.printf("먬버십 할인 적용된 금액은 %d 입니다.\n", totalPrice);
    }

    public double getDiscountRate(){
        switch (memberType){
            case "VIP":
                return 0.2;
            case "FAMILY":
            default:
                return 0;
        }
    }

}

package design.solid.solution;

public class CheckOut {
    int totalPrice = 50000;
    private String memberType;

    public CheckOut(String memberType) {
        this.memberType = memberType;
    }

    public void calcDiscount() {
        System.out.printf("합계: %d\n", totalPrice);
        if(memberType.equals("VIP")) {
            totalPrice -= (int) totalPrice * 0.2;
        }
        System.out.printf("할인 적용 후: %d", totalPrice);
    }

    public static void main(String[] args) {
        CheckOut checkout = new CheckOut("VIP");
        checkout.calcDiscount();
    }
}

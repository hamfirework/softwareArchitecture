package design.solid.solution;

public class CheckOutSolution {
    final int totalPrice = 50000;
    private String memberType;

    public CheckOutSolution(String memberType) {
        this.memberType = memberType;
    }

    // Solution-1: 객체 타입을 받아서 처리, DIP, OCP 적용 됨. -> Strategy Pattern.
    public void calcDiscount(DiscountPolicy policy) {
        int afterTotal = policy.calc(totalPrice);
        System.out.printf("합계: %d\n", totalPrice);
        System.out.printf("할인 적용 후: %d\n", afterTotal);
    }

    // Solution-2: Enum 고급 활용을 통한 처리, DIP, OCP 적용 됨.
    public void calcDiscount(MemberType type) {
        long afterTotal = type.calc(totalPrice);
        System.out.printf("합계: %d\n", totalPrice);
        System.out.printf("할인 적용 후: %d", afterTotal);
    }

    public static void main(String[] args) {
        CheckOutSolution checkout = new CheckOutSolution("VIP");
        checkout.calcDiscount(new VipDP());
        checkout.calcDiscount(MemberType.VIP);
    }
}

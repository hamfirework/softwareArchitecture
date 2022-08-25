package design.solid.v2;

public class DemoApp {

    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut(new VIPMember());
        checkOut.calcDiscount();
    }
}

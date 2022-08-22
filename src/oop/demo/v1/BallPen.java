package oop.demo.v1;

public class BallPen extends Pen{

    public BallPen(String maker, String name, String color, InkType ink) {
        super(maker, name, color, ink);
    }

    @Override
    public void readyToUse() {
        System.out.println("버튼을 눌러 볼펜심을 나오게 합니다.");
    }

    @Override
    public void writeDetail() {
         System.out.println("볼사이로 잉크를 공급합니다.");
    }


}

package oop.demo.v1;

public class DemoApp {

    public static void main(String[] args) {

        Pen ballPen = new BallPen("미쯔비스", "/제트스트림펜", "파란색", InkType.GEL);
        Pen boardMarker = new BoardMarker("모나미", "마커S펜", "검정색", InkType.LIQUID);

        Person person = new Person("홍길동");

        person.holdPen(ballPen);
        person.readyToUse();
        person.writePaper("종이");

        System.out.println();

        person.holdPen(boardMarker);
        person.readyToUse();
        person.writePaper("화이트보드");

    }

}

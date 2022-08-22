package oop.demo.v2;

import oop.demo.v1.BallPen;
import oop.demo.v1.BoardMarker;
import oop.demo.v1.InkType;
import oop.demo.v1.Pen;

public class DemoApp {

    public static void main(String[] args) {

        Person person = new Person("홍길동");

        Pen ballPen = new BallPen("미쯔비스", "/제트스트림펜", "파란색", InkType.GEL);
        person.setPen(ballPen);
        person.write();

        System.out.println();

        Pen boardMarker = new BoardMarker("모나미", "마커S펜", "검정색", InkType.OIL);
        person.setPen(boardMarker);
        person.write();

    }

}

package oop.pratice.v2;

import oop.pratice.v1.InkType;
import oop.pratice.v1.Pen;

public class DemoApp {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        //Pen pen = PenFactory.getPen("모나미","마커S","검정색", InkType.OIL);
        Pen pen = PenFactory.getPen("모나미","마커S","검정색", InkType.OIL);

        person.setPen(pen);
        person.write();
    }
}
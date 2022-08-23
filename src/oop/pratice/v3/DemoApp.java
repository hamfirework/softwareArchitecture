package oop.pratice.v3;

import oop.pratice.v1.InkType;
import oop.pratice.v1.Pen;

@PenClass(name="oop.demo.v1.BallPen")
public class DemoApp {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        Pen pen = PenFactory.getPen("미쯔비스","제트스트림", "파란색", InkType.GEL);
        //Pen pen = PenFactory.getPen("모나미","마커S","검정색", InkType.OIL);

        person.setPen(pen);
        person.write();
    }
}
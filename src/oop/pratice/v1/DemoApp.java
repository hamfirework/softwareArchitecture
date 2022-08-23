package oop.pratice.v1;

public class DemoApp {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        Pen pen = new BoardMarker("모나미","마커S","검정색", InkType.OIL);

        person.setPen(pen);
        person.write();
    }
}
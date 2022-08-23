package oop.pratice.v1;

public class Person {
    private String name;
    private Pen pen;

    public Person(String name) {
        this.name = name;
    }

    void write() {
        String target;
        pick();
        pen.readyToUse();
        // Person이 펜 종류에 따라 tartget 을 구분해야 하는 책임을 가지고 있음 -> 관점에 따라 SRP 위배
        // target의 변동이나 추가가 있을 경우 코드를 수정해야 함. -> OCP 위배
        if(pen instanceof BallPen) {
            target = "종이";
        }
        else
            target = "화이트보드";
        pen.write(target);
    }

    void pick() {
        System.out.printf("%s 님이 %s펜을 집었습니다!!\n",name,pen);
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
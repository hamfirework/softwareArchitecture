package oop.pratice.v3;

import oop.pratice.v1.Pen;

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
        target = TargetManager.prepareTarget(pen.getClass());
        pen.write(target);
    }

    void pick() {
        System.out.printf("%s 님이 %s펜을 집었습니다!!\n",name,pen);
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
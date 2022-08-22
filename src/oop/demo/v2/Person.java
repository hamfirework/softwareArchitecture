package oop.demo.v2;

import oop.demo.v1.Pen;

import java.lang.annotation.Target;

public class Person {

    private String name;
    private Pen pen;

    public Person(String name) {
        this.name = name;
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }

    public void write(){
        System.out.println(name + " 님이" + pen.getMaker() + "/" + pen.getName() + "을 집었습니다!!");
        pen.readyToUse();
        pen.writeDetail();
        pen.write(TargetManager.prepareTarget(pen.getClass()));
    }

}

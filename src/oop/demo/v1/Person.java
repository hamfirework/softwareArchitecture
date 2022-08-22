package oop.demo.v1;

public class Person {

    private String name;
    private Pen pen;

    public Person(String name) {
        this.name = name;
    }

    public void holdPen(Pen pen) {
        System.out.println(name + " 님이" + pen.getMaker() + "/" + pen.getName() + "을 집었습니다!!");
        this.pen = pen;
    }

    public void readyToUse(){
        pen.readyToUse();
    }

    public void writePaper(String paper){
        pen.writeDetail();
        pen.write(paper);
    }

}

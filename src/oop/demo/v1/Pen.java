package oop.demo.v1;

public abstract class Pen {
    private String maker;
    private String name;
    private String color;
    InkType ink;

    public String getMaker() {
        return maker;
    }

    public String getName() {
        return name;
    }

    public Pen(String maker, String name, String color, InkType ink) {
        this.maker = maker;
        this.name = name;
        this.color = color;
        this.ink = ink;
    }

    public abstract void readyToUse();

    public abstract void writeDetail();

    public void write(String paper){
        System.out.println(paper+"에 " + color + ", " + ink.getType() + " 잉크로 출력" );
    };
}

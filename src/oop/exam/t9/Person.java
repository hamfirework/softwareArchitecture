package oop.exam.t9;

public class Person {
    private String name;
    private Iron iron;

    public Person(String name) {
        this.name = name;
    }

    void iron() {
        String target;
        pick();
        iron.readyToUse();
        if(iron instanceof DryIron) {
            target = "다리미판";
        }
        else
            target = "옷걸이";
        iron.write(target);
    }

    void pick() {
        System.out.printf("%s 님이 %s다리미를 집었습니다!!\n",name, iron);
    }

    public void setIron(Iron iron) {
        this.iron = iron;
    }
}
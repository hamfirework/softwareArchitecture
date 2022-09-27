package refacotring.oop;

public class Zergling {

    private int hp = 80;
    private int mana = 200;


    public void attack(){
        this.hp += 1;
        this.mana -= 10;
    }

    public void move(){
        this.hp -= 10;
        this.mana += 5;
    }

    public void status(){
        System.out.println("hp : " + hp);
        System.out.println("mana : " + mana);
    }


}

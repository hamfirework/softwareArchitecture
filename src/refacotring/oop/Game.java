package refacotring.oop;

public class Game {
    public static void main(String[] args) {
        Zergling zergling1 = new Zergling();
        Zergling zergling2 = new Zergling();

        zergling1.attack();
        zergling1.status();

        zergling2.move();
        zergling2.status();

    }
}

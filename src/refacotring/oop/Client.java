package refacotring.oop;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.plus(5,3);
        calculator.printResult();

    }
}

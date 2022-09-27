package refacotring.day3.phone;

public class SmartPhone extends Phone{

    @Override
    public void call() {
        System.out.println("SmartCalling...");
    }

    public void internet(){
        System.out.println("Internet...");
    }
}

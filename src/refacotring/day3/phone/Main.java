package refacotring.day3.phone;

public class Main {

    static Phone makePhone(String name){
        if(name.equals("SMART")) return new SmartPhone();
        if(name.equals("PHONE")) return new Phone();
        return null;
    }


    static void connect(Phone p){
        p.call();
    }

    public static void main(String[] args) {
        Phone smartPhone = makePhone("SMART");
        connect(smartPhone);

        Phone phone = makePhone("PHONE");
        connect(phone);

    }
}

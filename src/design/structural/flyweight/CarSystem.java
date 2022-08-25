package design.structural.flyweight;

public class CarSystem {
    ExtAPIFactory factory = new ExtAPIFactory();
    public void apicall() {
            factory.getApi("search","국회의사당").send();
            factory.getApi("search","롯데타워").send();
            factory.getApi("traffic_info", "남부순환로").send();
    }

    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        cs.apicall();
    }
}

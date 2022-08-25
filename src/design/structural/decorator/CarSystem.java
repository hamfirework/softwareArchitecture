package design.structural.decorator;

public class CarSystem {
    ModuleIF m1 = new ECUModule();
    ModuleIF m2 = new SCCModule(m1);
    ModuleIF m3 = new HDAModule(new SCCModule(m1));

    void sendData() {
        m1.sendData();
        m2.sendData();
        m3.sendData();
    }

    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        cs.sendData();
    }
}

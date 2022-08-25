package design.factory.v3;

public class App {
    public static void main(String[] args) {
        VehicleFactory vf = new VehicleFactory(Vtype.Car);
        Vehicle v = vf.createNew();
        v.go();
    }
}

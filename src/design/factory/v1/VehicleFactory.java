package design.factory.v1;

public class VehicleFactory {
    public static Vehicle createNew(Vtype type) {
        Vehicle v = null;
        switch(type) {
            case Car: v = new Car();break;
            case Truck: v =  new Truck();break;
        }
        return v;
    }
}

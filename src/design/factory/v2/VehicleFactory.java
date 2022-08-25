package design.factory.v2;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VehicleFactory {
    Map<Vtype,Vehicle>  vrepo = new HashMap<>();

    Vtype type;

    public VehicleFactory(Vtype type) {
        this.type = type;
        vrepo.put(Vtype.Car, new Car());
        vrepo.put(Vtype.Truck, new Truck());

        //Arrays.stream(Vtype.values()).forEach(System.out::println);

    }
    public Vehicle createNew() {
        return vrepo.get(type);
    }
}

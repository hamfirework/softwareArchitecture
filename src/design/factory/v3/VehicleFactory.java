package design.factory.v3;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VehicleFactory {
    Map<Vtype, Vehicle>  vrepo = new HashMap<>();

    Vtype type;

    public VehicleFactory(Vtype type) {
        this.type = type;
        //Arrays.stream(Vtype.values()).forEach(System.out::println);
        for(Vtype vt : Vtype.values()) {
            try {
                Class<?> t = Class.forName("design.factory.v3."+vt.name());
                Constructor<?> constructor = t.getConstructor();
                vrepo.put(vt, (Vehicle)constructor.newInstance());
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    public Vehicle createNew() {
        return vrepo.get(type);
    }
}

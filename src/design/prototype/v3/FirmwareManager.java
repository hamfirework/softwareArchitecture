package design.prototype.v3;

import java.util.ArrayList;
import java.util.List;

public class FirmwareManager {
    List<Car> cars = new ArrayList<>();

    void newFirmwareReady() {
        System.out.println("## FirmwareManager: 새로운 펌웨어가 있습니다!!");
        notifyNew();
    }

    void addCar(Car car) {
        cars.add(car);
    }

    void notifyNew() {
        cars.forEach(s -> s.update());
    }
}

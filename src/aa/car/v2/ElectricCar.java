package aa.car.v2;

public class ElectricCar extends Car {

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void drive(Module module) {
        System.out.printf("> 전기차: %s 차량 입니다.\n", name);
        System.out.printf("> %s 기능으로 주행중입니다.!!\n", module);
    }
}

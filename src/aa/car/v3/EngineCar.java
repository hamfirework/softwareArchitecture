package aa.car.v3;

public class EngineCar extends Car {

    public EngineCar(String name) {
        super(name);
    }

    @Override
    public void drive(Module module) {
        System.out.printf("> 엔진차: %s 차량 입니다.\n", name);
        System.out.printf("> %s 기능으로 주행중 입니다!!\n", module.toString());
    }
}

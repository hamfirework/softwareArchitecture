package car.solution.v2;

public class ElectricCar extends Car {
    @Override
    public void drive(DriveOption impl) {
        System.out.println("> "+name+" 차량 입니다.");
        impl.work();
    }

    public ElectricCar(String name) {
        super("전기차: "+name);
    }
}
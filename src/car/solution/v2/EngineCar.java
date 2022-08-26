package car.solution.v2;

public class EngineCar extends Car {
    public void drive(DriveOption impl) {
        System.out.println("> "+name+" 차량 입니다.");
        impl.work();
    }
    public EngineCar(String name) {
        super("엔진카: "+name);
    }
}
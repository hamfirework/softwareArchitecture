package aa.car.v1;

public class ElectricCar extends Car {

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.printf("# 전기차: %s 차량 입니다.\n", name);
        System.out.println("> 어댑티브 크루즈 컨트롤, 차간거리 자동 유지, 차선유지 운전자 보조 장치로 주행중입니다.!!");
    }
}

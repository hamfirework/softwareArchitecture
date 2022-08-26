package aa.car.v1;

public class EngineCar extends Car {

    public EngineCar(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.printf("# 엔진차: %s 차량 입니다.\n", name);
        System.out.println("> 자동 변속기, 핸들 조작, 엑셀, 브레이크 운전자 조작에 의해 주행중 입니다!!");
    }
}

package car.solution.v1;

public class ElectricCar extends Car {

    public ElectricCar(String name) {
        super("전기차: "+name);
    }

    @Override
    public void drive() {
        System.out.println("# "+name+" 차량 입니다.");
        System.out.println("> 어댑티드 크루즈 컨트롤, 차간거리 자동 유지, 차선유지 운전자 보조 장치로 주행중 입니다!!");
    }
}
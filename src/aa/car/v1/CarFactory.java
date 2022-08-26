package aa.car.v1;

public class CarFactory {

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        Car engineCar = new EngineCar("현대 소나타");
        Car electricCar = new ElectricCar("테슬라 모델3");

        engineCar.drive();
        electricCar.drive();
    }


}

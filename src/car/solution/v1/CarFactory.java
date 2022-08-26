package car.solution.v1;

public class CarFactory {
    public void run() {
        Car c1 = new EngineCar("현대 소나타");
        Car c2 = new ElectricCar("테슬라 모델3");

        c1.drive();
        c2.drive();
    }

    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        cf.run();
    }
}

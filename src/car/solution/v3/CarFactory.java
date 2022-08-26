package car.solution.v3;

public class CarFactory {
    public void run() {
        Car c1 = new EngineCar("현대 소나타");
        Car c2 = new ElectricCar("테슬라 모델3");

        c1.drive(new HDA());
        c2.drive(new FSD());
        c2.drive(new DrivePilotAdapter());
    }

    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        cf.run();
    }
}

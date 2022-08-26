package car.solution.v3;

public abstract class Car {
    String name;
    public abstract void drive(DriveOption impl);

    public Car(String name) {
        this.name = name;
    }
}
package car.solution.v1;

public abstract class Car {
    String name;
    public abstract void drive();

    public Car(String name) {
        this.name = name;
    }
}
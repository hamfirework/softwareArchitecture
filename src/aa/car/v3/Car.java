package aa.car.v3;

public abstract class Car {

    String name;

    public Car(String name) {
        this.name = name;
    }

    public abstract void drive(Module module);
}

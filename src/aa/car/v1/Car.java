package aa.car.v1;

public abstract class Car {

    String name;

    public Car(String name) {
        this.name = name;
    }

    public abstract void drive();
}

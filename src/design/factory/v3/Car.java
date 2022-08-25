package design.factory.v3;

public class Car implements Vehicle {

    public Car() {}
    @Override
    public void go() {
        System.out.println("Car go()");
    }
}

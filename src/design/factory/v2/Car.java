package design.factory.v2;

public class Car implements Vehicle {

    public Car() {}
    @Override
    public void go() {
        System.out.println("Car go()");
    }
}

package design.factory.v1;

public class Car implements Vehicle{
    @Override
    public void go() {
        System.out.println("Car go()");
    }
}

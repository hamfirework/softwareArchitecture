package design.factory.v3;

public class Truck implements Vehicle {

    public Truck() {}
    @Override
    public void go() {
        System.out.println("Truck go()");
    }
}

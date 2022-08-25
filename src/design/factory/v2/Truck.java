package design.factory.v2;

public class Truck implements Vehicle {

    public Truck() {}
    @Override
    public void go() {
        System.out.println("Truck go()");
    }
}

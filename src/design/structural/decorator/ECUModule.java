package design.structural.decorator;

public class ECUModule implements ModuleIF{

    @Override
    public void sendData() {
        System.out.println(("ECU Module: ECU receives information.."));
    }
}

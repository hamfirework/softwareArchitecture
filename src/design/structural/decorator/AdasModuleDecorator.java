package design.structural.decorator;

public abstract class AdasModuleDecorator implements ModuleIF{

    @Override
    public void sendData() {
        System.out.println(("AdasModule: send data.."));
    }
}
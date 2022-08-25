package design.structural.decorator;

public class HDAModule extends AdasModuleDecorator{
    ModuleIF module;

    public HDAModule(ModuleIF module) {
        this.module = module;
    }
    @Override
    public void sendData() {
        module.sendData();
        System.out.println(">> HDAModule push data to sensor");
    }
}

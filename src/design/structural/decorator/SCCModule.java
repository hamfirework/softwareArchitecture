package design.structural.decorator;

public class SCCModule extends AdasModuleDecorator{
    ModuleIF module;

    public SCCModule(ModuleIF module) {
        this.module = module;
    }
    @Override
    public void sendData() {
        module.sendData();
        System.out.println(">> SCCModule out and send data..");
    }
}

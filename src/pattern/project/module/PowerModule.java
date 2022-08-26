package pattern.project.module;

public class PowerModule implements ModuleIF{

    @Override
    public void turnOn() {
        System.out.println("청소기 전원을 On 합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("청소기 전원을 Off 합니다.");
    }
}

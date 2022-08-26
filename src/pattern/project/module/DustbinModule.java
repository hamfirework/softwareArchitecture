package pattern.project.module;


/*
* 청소기 먼지통 센서
* */
public class DustbinModule implements ModuleIF{

    @Override
    public void turnOn() {
        System.out.println("먼지통이 경고등을 On 합니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("먼지통 경고등을 Off 합니다.");
    }
}

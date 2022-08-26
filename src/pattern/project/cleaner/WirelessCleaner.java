package pattern.project.cleaner;

import pattern.project.module.MType;

public class WirelessCleaner extends Cleaner{

    public WirelessCleaner(String name) {
        super(name);
    }

    @Override
    public void cleaning() {
        moduleIFMap.get(MType.POWER).turnOn();
        System.out.printf("%s 무선 청소기를 작동합니다.\n", name);
    }

    @Override
    public void stopCleaning() {
        moduleIFMap.get(MType.POWER).turnOff();
        System.out.println("청소를 종료 합니다.");
    }

    @Override
    public void dustFull() {
        moduleIFMap.get(MType.DUSTBIN).turnOn();
        notifySubscribers(MType.DUSTBIN);
        moduleIFMap.get(MType.POWER).turnOff();
    }
}

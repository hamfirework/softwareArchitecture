package pattern.project.cleaner;

import pattern.project.module.DustbinModule;
import pattern.project.module.MType;
import pattern.project.module.ModuleIF;
import pattern.project.module.PowerModule;
import pattern.project.observer.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Cleaner {

    String name;
    Map<MType, ModuleIF> moduleIFMap;
    Map<MType, Observer> observers = new HashMap<>();

    public void addSubscribe(MType type, Observer observer) {
        observers.put(MType.DUSTBIN, observer);
    }

    void notifySubscribers(MType mType) {
        observers.get(mType).update();
    }

    public Cleaner(String name) {
        this.name = name;
        moduleIFMap = new HashMap<>();
        moduleIFMap.put(MType.POWER, new PowerModule());
        moduleIFMap.put(MType.DUSTBIN, new DustbinModule());
    }

    public abstract void cleaning();

    public abstract void stopCleaning();

    public abstract void dustFull();

}

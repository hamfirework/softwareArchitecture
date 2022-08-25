package design.behavioral.observer;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addSubscribe(Observer observer) {
        observers.add(observer);
    }

    void notifySubscribers() {
        observers.forEach(s -> s.update());
    }

    abstract void addNews();
}

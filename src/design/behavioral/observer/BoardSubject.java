package design.behavioral.observer;

public class BoardSubject extends Subject{

    @Override
    void addNews() {
        System.out.println("#BoardSubject 에 새로운 소식 추가됨!!");
        notifySubscribers();
    }
}

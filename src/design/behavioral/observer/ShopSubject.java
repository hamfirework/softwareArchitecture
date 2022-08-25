package design.behavioral.observer;

public class ShopSubject extends Subject{

    @Override
    void addNews() {
        System.out.println("#ShopSubject 에 새로운 소식 추가됨!!");
        notifySubscribers();
    }
}

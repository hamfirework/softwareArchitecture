package design.behavioral.observer;

public class App {
    public static void main(String[] args) {
        Subject s1 = new ShopSubject();
        s1.addSubscribe(new AppObserver());
        s1.addSubscribe(new WebObserver());

        Subject s2 = new BoardSubject();
        s2.addSubscribe(new WebObserver());

        s1.addNews();
        s2.addNews();
    }
}

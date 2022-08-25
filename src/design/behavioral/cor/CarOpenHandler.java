package design.behavioral.cor;

public abstract class CarOpenHandler {
    protected CarOpenHandler next;

    // 생성자에서 next 를 지정해도 되고 setNext() 를 별도로 만들어도 가능 함.
    public CarOpenHandler(CarOpenHandler handler) {
        next = handler;
    }

    public abstract boolean open(OpenMethod method);

}

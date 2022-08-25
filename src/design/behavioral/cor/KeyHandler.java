package design.behavioral.cor;

public class KeyHandler extends CarOpenHandler {

    public KeyHandler(CarOpenHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean open(OpenMethod method) {
        if(method == OpenMethod.KEY) {
            System.out.println("# 자동차 키로 문열기에 성공 했습니다.!!");
            return true;
        } else if(next != null) {
            return next.open(method);
        }
        return false;
    }
}
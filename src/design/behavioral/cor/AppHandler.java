package design.behavioral.cor;

public class AppHandler extends CarOpenHandler {

    public AppHandler(CarOpenHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean open(OpenMethod method) {
        if(method == OpenMethod.APP) {
            System.out.println("# 스마트폰 앱으로 원격 문열기 성공 했습니다.!!");
            return true;
        } else if(next != null) {
            return next.open(method);
        }
        return false;
    }
}
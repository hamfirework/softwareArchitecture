package design.behavioral.cor;

public class VoiceHandler extends CarOpenHandler {

    public VoiceHandler(CarOpenHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean open(OpenMethod method) {
        if(method == OpenMethod.VOICE) {
            System.out.println("# 음성인식으로 문열기에 성공 했습니다.!!");
            return true;
        } else if(next != null) {
            return next.open(method);
        }
        return false;
    }
}
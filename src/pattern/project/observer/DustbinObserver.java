package pattern.project.observer;

public class DustbinObserver implements Observer{

    @Override
    public void update() {
        System.out.println("먼지통이 꽉찼어요. 비워주세요");
    }
}

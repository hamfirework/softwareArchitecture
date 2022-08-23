package oop.pratice.v1;

public class BoardMarker extends Pen {

	public BoardMarker(String maker, String name, String color, InkType ink) {
		super(maker, name, color, ink);
	}
	
	public void readyToUse() {
		System.out.println("뚜껑을 오픈 합니다!!");
	}

	@Override
	public void writeDetail() {
		System.out.println("펜심 내부에 잉크를 공급 합니다!!");
	}
}
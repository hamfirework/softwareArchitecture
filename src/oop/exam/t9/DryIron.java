package oop.exam.t9;

public class DryIron extends Iron {

	public DryIron(String maker, String name, ClothType clothType) {
		super(maker, name, clothType);
	}

	@Override
	public void readyToUse() {
		System.out.println("다리미에 전원을 킵니다.");
	}

	@Override
	public void ironDetail() {
		System.out.printf("%s 옷감 모드로 온도를 조절하여 다리미를 예열합니다.\n", getCloth());
	}
}
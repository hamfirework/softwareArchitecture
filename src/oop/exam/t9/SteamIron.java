package oop.exam.t9;

public class SteamIron extends Iron {

	public SteamIron(String maker, String name, ClothType clothType) {
		super(maker, name, clothType);
	}
	
	public void readyToUse() {
		System.out.println("다리미의 전원을 킵니다");
	}

	@Override
	public void ironDetail() {
		System.out.printf("%s 옷감 모드로 스팀을 가열합니다\n", getCloth());
	}
}
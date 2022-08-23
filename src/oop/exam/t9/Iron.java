package oop.exam.t9;

public abstract class Iron {
	private String manufacturer;
	private String name;
	private ClothType cloth;

	// protected 하는 것이 더 좋지만 예제 패키지들이 다른 부분 고려.
	public abstract void readyToUse();
	public abstract void ironDetail();
	
	public void write(String target) {
		ironDetail();
		System.out.printf("%s에 %s 옷감을 다림질 진행\n", target, cloth);
	}
	
	public Iron(String manufacturer, String name, ClothType ink) {
		this.manufacturer = manufacturer;
		this.name = name;
		this.cloth = ink;
	}

	@Override
	public String toString() {
		return manufacturer + "/" + name;
	}

	ClothType getCloth() {
		return cloth;
	}
}
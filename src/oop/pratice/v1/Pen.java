package oop.pratice.v1;

public abstract class Pen {
	private String maker;
	private String name;
	private String color;
	private InkType ink;

	// protected 하는 것이 더 좋지만 예제 패키지들이 다른 부분 고려.
	public abstract void readyToUse();
	public abstract void writeDetail();
	
	public void write(String target) {
		writeDetail();
		System.out.printf("%s에 %s, %s 잉크로 출력\n", target, color, ink);
	}
	
	public Pen(String maker, String name, String color, InkType ink) {
		this.maker = maker;
		this.name = name;
		this.color = color;
		this.ink = ink;
	}

	@Override
	public String toString() {
		return maker + "/" + name;
	}

	InkType getInk() {
		return ink;
	}
}
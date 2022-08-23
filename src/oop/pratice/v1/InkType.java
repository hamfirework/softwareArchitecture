package oop.pratice.v1;

public enum InkType {
	OIL("유성"), 
	GEL("젤"), 
	WATER("수성");

	private String name;
	InkType(final String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
}

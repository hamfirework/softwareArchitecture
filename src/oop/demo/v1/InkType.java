package oop.demo.v1;

public enum InkType {
    LIQUID("액상"), GEL("젤"), OIL("유성");


    private InkType(String type) {
        this.type = type;
    }
    private final String type;

    public String getType(){
        return type;
    }

}

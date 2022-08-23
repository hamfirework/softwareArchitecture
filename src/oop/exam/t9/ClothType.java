package oop.exam.t9;


public enum ClothType {
    SILK("실크"),
    NYLON("나일론"),
    POLYESTER("폴리에스터"),
    WOOL("울"),
    COTTEN("면"),
    MO("모직");

    private String name;

    ClothType(final String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

}
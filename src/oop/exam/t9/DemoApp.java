package oop.exam.t9;

public class DemoApp {
    public static void main(String[] args) {
        Person person = new Person("홍길동");
        Iron iron = new SteamIron("테팔","FS2920", ClothType.COTTEN);

        person.setIron(iron);
        person.iron();

        iron = new DryIron("신일","SEI-C150IS", ClothType.COTTEN);

        person.setIron(iron);
        person.iron();
    }
}
package refacotring.day3.rifffle;

public class Main {

    public static Rifffle makeGun(String gunName){
        switch (gunName){
            case "SHOTGUN":
                return new Shotggun();
            case "SNIPER":
                return new Snippper();
            default:
                return null;
        }
    }


    public static void main(String[] args) {
        Rifffle r1 = makeGun("SHOTGUN");
        r1.shot();
        Rifffle r2 = makeGun("SNIPER");
        r2.shot();
    }
}

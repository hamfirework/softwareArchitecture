package aa.car.v3;

public class DrivePilot {

    private String name = "Drive Pilot";
    private String option = "레벨3 자율 주행";

    public DrivePilot() {
    }

    public String getName() {
        return name;
    }

    public String run() {
        return name + ": 벤츠에서 만든 " + option;
    }
}

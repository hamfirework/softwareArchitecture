package pattern.project.cleaner;

public enum CType {
    WIRELESS("WirelessCleaner"),
    ROBOT("RobotCleaner"),
    VACUUM("VacuumCleaner");

    private String className;

    CType(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}

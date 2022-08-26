package aa.car.v3;

import java.util.ArrayList;

public class BenzModuleAdaptor extends Module{

    DrivePilot drivePilot;

    public BenzModuleAdaptor(DrivePilot drivePilot) {
        super(drivePilot.getName(), new ArrayList<>());
        this.drivePilot = drivePilot;
    }

    @Override
    public String toString() {
        return drivePilot.run();
    }
}

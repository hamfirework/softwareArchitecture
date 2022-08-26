package aa.car.v2;

import java.util.ArrayList;

public class AutoPilotModule extends Module {

    public AutoPilotModule() {
        super("테슬라 AutoPilot", new ArrayList<>());
        options.add("어댑티브 크루즈 컨트롤");
        options.add("차간거리 자동 유지");
        options.add("차선유지");
        options.add("자동주차");
    }
}

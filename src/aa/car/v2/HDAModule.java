package aa.car.v2;

import java.util.ArrayList;

public class HDAModule extends Module {

    public HDAModule() {
        super("현대 HDA", new ArrayList<>());
        options.add("어댑티브 크루즈 컨트롤");
        options.add("차간거리 자동 유지");
        options.add("차선유지");
        options.add("고속도로 자율 주행");
    }

}

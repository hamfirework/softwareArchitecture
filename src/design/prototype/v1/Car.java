package design.prototype.v1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Car implements Cloneable{
    private String name;
    List<String> firmware;

    public Car() {
        firmware = new ArrayList<>();
    }

    public void loadFirmware() {
        // 펌웨어 자체를 로드하는 과정이 길다고 가정. 일단 로드하고 나면 리스트 구조로 경량화됨.
        firmware.add("펌웨어 v1.0");
        firmware.add("네비게이션 3D 모드");
        firmware.add("자동 차선 변경 모드");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
         return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
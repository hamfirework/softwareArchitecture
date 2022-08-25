package design.prototype.v3;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable, Observer{
    private String name;
    // 변경되지 않는 기본 펌웨어 영역
    final List<String> bfirmware;

    // 변경되는 펌웨어 영역
    List<String> firmware;

    public Car() {
        bfirmware = new ArrayList<>();
    }

    public void loadFirmware() {
        bfirmware.add("펌웨어 v1.0");
        bfirmware.add("네비게이션 3D 모드");
        bfirmware.add("자동 차선 변경 모드");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return this;
        firmware = new ArrayList<>(bfirmware);
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("## "+name+": 새로운 펌웨어가 나와서 업데이트를 진행 합니다!!!");
        // 기존 펌웨어를 초기화 하고 진행할수도 있음.
        // firmware.clear();
        firmware.add("펌웨어 v2.0");
        firmware.add("ADAS 성능 개선");
        firmware.add("네비게이션 지도 2022-3 설치");
    }
}
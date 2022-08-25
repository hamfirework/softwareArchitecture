package design.prototype.v2;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable{
    private String name;
    final List<String> bfirmware;
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
}
package oop.pratice.v2;

import oop.pratice.v1.BallPen;
import oop.pratice.v1.BoardMarker;

import java.util.HashMap;
import java.util.Map;

public class TargetManager {
    static Map<Class, String> target = new HashMap<>();

    // 실제 구현시에는 DB 혹은 설정파일에서 가지고 와서 reflection 으로 map에 넣는것으로 구현.
    static {
        target.put(BallPen.class,"종이");
        target.put(BoardMarker.class,"화이트보드");
    }

    public static String prepareTarget(Class cls) {
        return target.get(cls);
    }
}
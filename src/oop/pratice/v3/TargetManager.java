package oop.pratice.v3;

import oop.demo.v1.BallPen;
import oop.demo.v1.BoardMarker;

import java.util.HashMap;
import java.util.Map;

public class TargetManager {
    static Map<Class, String> target = new HashMap<>();

    // 데이터는 DB 혹은 설정파일에서 가지고 와서 map에 넣는것으로 간주
    static {
        target.put(BallPen.class,"종이");
        target.put(BoardMarker.class,"화이트보드");
    }

    public static String prepareTarget(Class cls) {
        return target.get(cls);
    }
}
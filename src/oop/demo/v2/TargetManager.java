package oop.demo.v2;

import oop.demo.v1.BallPen;
import oop.demo.v1.BoardMarker;

import java.util.HashMap;
import java.util.Map;

public class TargetManager {

    static Map<Class, String> target = new HashMap<>();

    static{
        target.put(BallPen.class, "종이");
        target.put(BoardMarker.class, "화이트보드");
    }

    public static String prepareTarget(Class cls){
        return target.get(cls);
    }

}

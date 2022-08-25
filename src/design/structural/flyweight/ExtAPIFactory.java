package design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ExtAPIFactory {
    Map<String, ExtAPI> apis = new HashMap<>();

    // 여기서는 TMAP 만으로 가정하고 함. tmap 안에서 요청 유형에 따라서만 구분.
    public ExtAPI getApi(String type, String data) {
        ExtAPI api = (ExtAPI) apis.get(type);
        if( api == null) {
            TMapAPI newapi = new TMapAPI(type, "");
            apis.put(type, newapi);
            api = newapi;
        }
        api.setData(data);
        return apis.get(type);
    }
}

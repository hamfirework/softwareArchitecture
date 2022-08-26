package aa.car.v2;

import java.util.List;

public abstract class Module {

    String name;
    List<String> options;

    public Module(String name, List<String> options) {
        this.name = name;
        this.options = options;
    }

    public void addOptions(String optionName){
        options.add(optionName);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(name).append(" :");
        for(int i=0; i<options.size(); i++){
            str.append(" "+ options.get(i));
            if(i != options.size() - 1) str.append(",");
        }
        return str.toString();
    }
}

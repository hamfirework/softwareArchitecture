package aa.mode.p2;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class NewVoteSystem {

    String data = "[{'sid': '11928271','vote':1},{'sid': '22828279','vote':2}]";
    Map<Integer, Integer> voteResult;

    public NewVoteSystem() {
        JSONArray array = new JSONArray(data);
        this.voteResult = calcMap(array);

    }

    public Map<Integer, Integer> calcMap(JSONArray array){
        Map<Integer, Integer> result = new HashMap<>();
        for(int i=0; i<array.length(); i++){
            Integer cnum = (Integer) array.getJSONObject(i).get("vote");
            if(result.containsKey(cnum)) result.put(cnum, result.get(cnum) + 1);
            else result.put(cnum, 1);
        }
        return result;
    }

    public void print(){
        voteResult.forEach((k,v) -> {
            System.out.printf("%d번 : %d\n", k, v);
        });
    }

    public static void main(String[] args) {
        NewVoteSystem vs = new NewVoteSystem();
        vs.print();
    }


}

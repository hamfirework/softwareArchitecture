package aa.mode.p2;

import org.json.JSONArray;

import java.util.HashMap;
import java.util.Map;

public class NewVoteSystemV2 {

    String data = "[{'sid': '11928271','vote':1},{'sid': '22828279','vote':2}]";

    public NewVoteSystemV2() {
        JSONArray array = new JSONArray(data);
        int[] voteResultArray = calcIntArray(array, 2);
        for(int i=1; i<voteResultArray.length; i++){
            System.out.printf("%d번 : %d\n", i, voteResultArray[i]);
        }
    }

    public int[] calcIntArray(JSONArray array, int candidateTotal){
        int[] result = new int[candidateTotal+1];
        for(int i=0; i<array.length(); i++){
            Integer cnum = (Integer) array.getJSONObject(i).get("vote");
            result[cnum]++;
        }
        return result;
    }

    public static void main(String[] args) {
        NewVoteSystemV2 vs = new NewVoteSystemV2();
    }


}

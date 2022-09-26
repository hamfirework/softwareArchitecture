package aa.mode.p2;

import org.json.JSONArray;

public class OldVoteSystem {

    String data = "[{'sid': '11928271','vote':1},{'sid': '22828279','vote':2}]";
    int n1total = 0;
    int n2total = 0;
    public OldVoteSystem() {
        JSONArray array = new JSONArray(data);
        System.out.println(array);
        for (int i = 0; i < array.length(); i++) {
            Integer cnum = (Integer) array.getJSONObject(i).get("vote");
            if (cnum == 1) {
                n1total++;
            } else if (cnum == 2) {
                n2total++;
            }
        }
        System.out.printf("1번: %d\n2번: %d", n1total, n2total);
    }

    public static void main(String[] args) {
        OldVoteSystem vs = new OldVoteSystem();
    }

}




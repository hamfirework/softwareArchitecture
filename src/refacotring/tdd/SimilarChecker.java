package refacotring.tdd;

public class SimilarChecker {
    public int calcSimilarPoint(String a, String b) {
        return calcLengthPoint(a,b) + calcAlphabetPoint(a,b);
    }
    public int calcLengthPoint(String a, String b) {
        int big = a.length();
        int small = b.length();
        if(b.length() > a.length()){
            big = b.length();
            small = a.length();
        }
        return getLengthPoint(big, small);
    }
    private int getLengthPoint(int big, int small) {
        double rate = (double) big / small;
        if(rate == 1.00) return 50;
        if(rate < 1.25) return 40;
        if(rate < 1.5) return 30;
        if(rate < 1.75) return 20;
        if(rate < 2.0) return 10;
        return 0;
    }

    public int calcAlphabetPoint(String a, String b) {
        int[] aa = countAlphabet(a);
        int[] bb = countAlphabet(b);
        int same = 0, diff = 0;
        for(int i=0; i<26; i++){
            if(aa[i] == 0 && bb[i] == 0) continue;
            if(aa[i] != 0 && bb[i] != 0) same++;
            else diff++;
        }
        return getAlphabetPoint(same, diff);
    }

    private int[] countAlphabet(String a) {
        int[] result = new int[26];
        a = a.toLowerCase();
        for(int i = 0; i< a.length(); i++){
            result[a.charAt(i) - 'a']++;
        }
        return result;
    }

    private int getAlphabetPoint(int same, int diff) {
        double rate = (double) same / (same + diff);
        if(rate == 1.0) return 50;
        if(rate >= 0.75) return 40;
        if(rate >= 0.50) return 30;
        if(rate >= 0.25) return 20;
        if(rate > 0.0) return 10;
        return 0;
    }


}

package refacotring.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wheel {


    public static final int FIRST_CHANCE_MONEY = 1000;
    public static final int CONFIRMED = 1;
    public static final int FIRST_CHANCE_CONFIRMED = 2;

    public static final int SECOND_CHANCE_MONEY = 2000;
    public static final int SECOND_INIT_VALUE = -1;


    public static ArrayList<StringBuilder> strs = new ArrayList<>();
    public static int[][] map = new int[5][50];
    public static String userdata;
    public static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String temp;
            temp = br.readLine();
            strs.add(new StringBuilder(temp));
        }
        userdata = br.readLine();
        br.close();


        calcPrizeMoney();
    }

    private static void calcPrizeMoney() {


        int sum = 0;
        int conCnt = 0;
        int[] ffirst = { 0, 0, 0, 0, 0 };
        int[] chance = { SECOND_INIT_VALUE, SECOND_INIT_VALUE, SECOND_INIT_VALUE, SECOND_INIT_VALUE, SECOND_INIT_VALUE };


        for (int i = 0; i < 26; i++) {
            char nextUserChar = userdata.charAt(i);
            sum += checkChanceAndGetChanceMoney(chance, nextUserChar);
            int passCnt = getPassCntFromAnswers(ffirst, chance, nextUserChar);
            sum += checkFirstChanceAndGetFirstChanceMoney(ffirst, chance);
            if (isPassQuiz(passCnt)) {
                conCnt++;
                sum += (conCnt * 100) * passCnt;
                continue;
            }
            conCnt = 0;
            initChance(chance);
        }
        System.out.println("$" + sum);
    }

    private static int checkChanceAndGetChanceMoney(int[] chance, char userChar) {
        boolean chanceSuccess = false;
        for (int y = 0; y < strs.size(); y++) {
            if (chance[y] != -1) {
                chanceSuccess = checkChanceSuccess(userChar, chance[y]);
                chance[y] = -1;
            }
        }
        return chanceSuccess ? SECOND_CHANCE_MONEY : 0;
    }

    private static boolean checkChanceSuccess(char userChar, int answerNum) {
        for (int x = 0; x < strs.get(answerNum).length(); x++) {
            if (map[answerNum][x] == 0 && strs.get(answerNum).charAt(x) == userChar) {
                return true;
            }
        }
        return false;
    }

    private static int getPassCntFromAnswers(int[] ffirst, int[] chance, char userChar) {
        int passCnt = 0;
        for (int y = 0; y < strs.size(); y++) {
            StringBuilder nextAnswerStr = strs.get(y);
            passCnt += getPassCntFromAnswer(ffirst, chance, userChar, y, nextAnswerStr);
        }
        return passCnt;
    }

    private static int getPassCntFromAnswer(int[] ffirst, int[] chance, char userChar, int answerNum, StringBuilder answer) {
        int passCnt = 0;
        for (int x = 0; x < answer.length(); x++) {
            if (map[answerNum][x] == CONFIRMED) continue;

            if (isEqualAnswerChar(answer.charAt(x), userChar)) {
                markingAnswer(ffirst, chance, answer, answerNum, x);
                passCnt++;
            }
        }
        return passCnt;
    }
    private static boolean isEqualAnswerChar(char answerChar, char userChar) {
        return answerChar == userChar;
    }
    private static void markingAnswer(int[] ffirst, int[] chance, StringBuilder answer, int answerNum, int charNum) {
        //Let's First 점수인지 확인한다.
        if (ffirst[answerNum] == 0 && charNum == 0) {
            ffirst[answerNum] = CONFIRMED;
            chance[answerNum] = answerNum;
        } else if (ffirst[answerNum] == 0 && charNum != 0) {
            ffirst[answerNum] = CONFIRMED;
        }
        map[answerNum][charNum] = CONFIRMED;
        answer.setCharAt(charNum, '_');
    }
    
    private static int checkFirstChanceAndGetFirstChanceMoney(int[] ffirst, int[] chance) {
        boolean firstChanceSuccess = false;
        for(int y = 0; y< ffirst.length; y++){
            if(ffirst[y] == CONFIRMED && chance[y] == y){
                firstChanceSuccess = true;;
                ffirst[y] = FIRST_CHANCE_CONFIRMED;
            }
        }
        return firstChanceSuccess ?  FIRST_CHANCE_MONEY : 0;
    }

    private static boolean isPassQuiz(int passCnt) {
        return passCnt != 0;
    }

    private static void initChance(int[] chance) {
        for (int t = 0; t < 5; t++) chance[t] = SECOND_INIT_VALUE;
    }












}

package refacotring.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wheel {


    public static final int NOT_CONFIRMED = 0;
    public static final int CONFIRMED = 1;

    public static final int FIRST_CHANCE_MONEY = 1000;
    public static final int FIRST_CHANCE_CONFIRMED = 2;

    public static final int SECOND_CHANCE_MONEY = 2000;
    public static final int SECOND_INIT_VALUE = -1;
    public static final int BASIC_MONEY = 100;


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
            sum += checkSecondChanceAndGetChanceMoney(chance, nextUserChar);
            int passCnt = getPassCntFromAnswers(ffirst, chance, nextUserChar);
            sum += checkFirstChanceAndGetChanceMoney(ffirst, chance);
            sum += getBasicMoney(++conCnt, passCnt);
            conCnt = checkInitAndGetConCnt(conCnt, chance, passCnt);
        }
        System.out.println("$" + sum);
    }

    private static int checkInitAndGetConCnt(int conCnt, int[] chance, int passCnt) {
        if (isPassQuiz(passCnt)) {
            return conCnt;
        }
        initChance(chance);
        return 0;
    }

    private static int getBasicMoney(int conCnt, int passCnt) {
        if (isPassQuiz(passCnt)) {
            return (conCnt * BASIC_MONEY) * passCnt;
        }
        return 0;
    }

    private static int checkSecondChanceAndGetChanceMoney(int[] chance, char userChar) {
        boolean chanceSuccess = false;
        for (int y = 0; y < strs.size(); y++) {
            if (chance[y] != SECOND_INIT_VALUE) {
                chanceSuccess = checkSecondChanceSuccess(userChar, chance[y]);
                chance[y] = SECOND_INIT_VALUE;
            }
        }
        return chanceSuccess ? SECOND_CHANCE_MONEY : 0;
    }

    private static boolean checkSecondChanceSuccess(char userChar, int answerNum) {
        for (int x = 0; x < strs.get(answerNum).length(); x++) {
            if (isSecondChanceSuccess(userChar, answerNum, x)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isSecondChanceSuccess(char userChar, int answerNum, int charNum) {
        return map[answerNum][charNum] == NOT_CONFIRMED && strs.get(answerNum).charAt(charNum) == userChar;
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
        if (ffirst[answerNum] == NOT_CONFIRMED && charNum == 0) {
            ffirst[answerNum] = CONFIRMED;
            chance[answerNum] = answerNum;
        } else if (ffirst[answerNum] == NOT_CONFIRMED && charNum != 0) {
            ffirst[answerNum] = CONFIRMED;
        }
        map[answerNum][charNum] = CONFIRMED;
        answer.setCharAt(charNum, '_');
    }

    private static int checkFirstChanceAndGetChanceMoney(int[] ffirst, int[] chance) {
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

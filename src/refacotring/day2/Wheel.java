package refacotring.day2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Wheel {


    public static final int FIRST_CHANCE_MONEY = 1000;
    public static final int CHANCE_MONEY = 2000;
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

        // 연속 점수 체크
        int conCnt = 0;
        // 상금
        int sum = 0;

        // 첫번째 글짜를 맞췄는가.
        int[] ffirst = { 0, 0, 0, 0, 0 };
        int[] chance = { -1, -1, -1, -1, -1 };




        //하나씩 처리
        //26글자 for 돌면서 퀴즈 참석자가 하나씩 시도를 하는 것
        for (int i = 0; i < 26; i++) {
            char nextUserChar = userdata.charAt(i);

            //1. 2000 달러 찬스를 얻었는지 검사
            sum += checkChanceAndGetChanceMoney(chance, nextUserChar);


            int passCnt = 0;

            //2중 for 돌면서 정답 문자열을 하나씩 검사해서
            //퀴즈참가자가 던진 문자가 존재하는지 검사
            for (int y = 0; y < strs.size(); y++) {
                for (int x = 0; x < strs.get(y).length(); x++) {
                    if (map[y][x] == 1) continue;

                    //만약 퀴즈참석자가 요청한 문자가,
                    //정답문자열과 동일하다면
                    if (strs.get(y).charAt(x) == nextUserChar) {

                        //Let's First 점수인지 확인한다.
                        if (ffirst[y] == 0 && x == 0) {
                            ffirst[y] = 1;
                            chance[y] = y;
                        } else if (ffirst[y] == 0 && x != 0) {
                            ffirst[y] = 1;
                        }

                        //used배열
                        map[y][x] = 1;

                        //해당 문자를 _로 바꿔버린다.
                        strs.get(y).setCharAt(x, '_');

                        //동일한 문자 개수를 Counting한다.
                        passCnt++;
                    }
                }
            }

            for(int y=0; y<ffirst.length; y++){
                if(ffirst[y] == 1 && chance[y] == y){
                    sum += FIRST_CHANCE_MONEY;
                    ffirst[y] = 2;
                }
            }

            if (passCnt != 0) {
                conCnt++;
                sum += (conCnt * 100) * passCnt;
            } else {
                conCnt = 0;
                for (int t = 0; t < 5; t++) chance[t] = -1;
            }
        }

        System.out.println("$" + sum);
    }

    private static int checkChanceAndGetChanceMoney(int[] chance, char nextUserChar) {
        boolean chanceSuccess = false;
        for (int y = 0; y < strs.size(); y++) {
            if (chance[y] != -1) {
                chanceSuccess = checkChanceSuccess(nextUserChar, chance[y]);
                chance[y] = -1;
            }
        }
        return chanceSuccess ? CHANCE_MONEY : 0;
    }

    private static boolean checkChanceSuccess(char nextUserChar, int y) {
        for (int x = 0; x < strs.get(y).length(); x++) {
            if (map[y][x] == 0 && strs.get(y).charAt(x) == nextUserChar) {
                return true;
            }
        }
        return false;
    }
}

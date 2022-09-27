package refacotring.day3.moive2;

import java.util.ArrayList;

class PLAY {
    String name;
    String type;

    PLAY(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class INVOICE {
    int playID;
    int audience;

    INVOICE(int playID, int audience) {
        this.playID = playID;
        this.audience = audience;
    }
}


public class Movie {

    private static final String PLAY_TYPE_FANTASY = "FANTASY";
    private static final String PLAY_TYPE_ACTION = "ACTION";

    private static final int BASIC_FANTASY_RENTAL_FEE = 30000;
    private static final int BASIC_ACTION_RENTAL_FEE = 40000;

    private static final int NUM_AUDIENCE_ACTION_ADDITIONAL_FEE_LIMIT = 300;
    private static final int NUM_AUDIENCE_FANTAGY_ADDITIONAL_FEE_LIMIT = 200;

    public static ArrayList<PLAY> plays = new ArrayList<>();
    public static ArrayList<INVOICE> invoice = new ArrayList<>();

    public static void main(String[] args) {

        init();
        String resultStr = statement(plays, invoice);
        System.out.println(resultStr);
    }

    public static void init()
    {
        plays.add(new PLAY("SquidGame", PLAY_TYPE_ACTION));
        plays.add(new PLAY( "withGod", PLAY_TYPE_FANTASY ));
        plays.add(new PLAY( "SpiderMan", PLAY_TYPE_ACTION ));
        plays.add(new PLAY( "IronMan", PLAY_TYPE_ACTION ));

        invoice.add(new INVOICE( 0, 550 ));
        invoice.add(new INVOICE( 1, 100 ));
        invoice.add(new INVOICE( 2, 200 ));
        invoice.add(new INVOICE( 3, 340 ));
    }

    public static String statement(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice) {
        int totalAmount = 0;
        int volumeCredits = 0;

        totalAmount += getTotalAmount(plays, invoice);
        volumeCredits += getVolumeCredits(plays, invoice);

        return getStatement(plays, invoice, totalAmount, volumeCredits);
    }

    private static String getStatement(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice, int totalAmount,
                                       int volumeCredits) {

        String result = "";
        result += "전체 영화 수 = " + plays.size() + "\n";
        result += "==========================\n";

        for (INVOICE perf : invoice) {
            PLAY play = plays.get(perf.playID);
            result += play.name + " : ";
            result += getAmount(perf.audience, play.type) + "원 (";
            result += perf.audience + ")\n";
        }

        //청구 내역 출력
        result += "==========================\n";
        result += "총액 : " + totalAmount + "\n";
        result += "적립 포인트 : " + volumeCredits + "\n";
        return result;
    }

    private static int getVolumeCredits(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice) {
        int result = 0;
        for (INVOICE perf : invoice) {
            PLAY play = plays.get(perf.playID);
            //포인트 적립
            if (perf.audience - 300 > 0) result += perf.audience - 300;
            if (play.type == PLAY_TYPE_ACTION) result += perf.audience / 5;
        }
        return result;
    }

    private static int getTotalAmount(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice) {
        int result = 0;
        for (INVOICE perf : invoice) {
            PLAY play = plays.get(perf.playID);
            result += getAmount(perf.audience, play.type);
        }
        return result;
    }

    private static int getAmount(int numAudience, String playType) {
        int thisAmount = 0;

        if (playType == PLAY_TYPE_ACTION) {
            //ACTION이면 단가 40000
            //단, 300명 초과시 다음 계산식에 의해 추가 비용 발생
            thisAmount = BASIC_ACTION_RENTAL_FEE;
            if (numAudience > NUM_AUDIENCE_ACTION_ADDITIONAL_FEE_LIMIT) {
                thisAmount += 1000 * (numAudience - 300);
            }
        }
        else if (playType == PLAY_TYPE_FANTASY) {
            thisAmount = BASIC_FANTASY_RENTAL_FEE;
            //ACTION이면 단가 30000
            //단, 200명 초과시 다음 계산식에 의해 추가 비용 발생
            if (numAudience > NUM_AUDIENCE_FANTAGY_ADDITIONAL_FEE_LIMIT) {
                thisAmount += 10000 + 500 * (numAudience - 200);
                thisAmount += 300 * numAudience;
            }
        }
        return thisAmount;
    }
}
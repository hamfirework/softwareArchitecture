package refacotring.day3.movie;

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
    public static final String PLAY_TYPE_ACTION = "ACTION";
    public static final int BASIC_AMOUNT_ACTION = 40000;
    public static final int AUDIENCE_BASIS_ACTION = 300;
    public static final int ADD_COST_PER_AUDIENCE_ACTION = 1000;


    public static final String PLATY_TYPE_FANTASY = "FANTASY";
    public static final int BASIC_AMOUNT_FANTASY = 30000;
    public static final int AUDIENCE_BASIS_FANTASY = 200;
    public static final int ADD_COST_PER_AUDIENCE_FANTASY = 500;
    public static final int ADD_COST_BASIS_FANTASY = 10000;
    public static final int ADD_EXTRA_COST_PER_AUDIENCE_FANTASY = 300;

    public static ArrayList<PLAY> plays = new ArrayList<>();
    public static ArrayList<INVOICE> invoice = new ArrayList<>();

    public static void main(String[] args) {
        init();
        statement(plays, invoice);
    }

    public static void init()
    {
        plays.add(new PLAY("SquidGame", PLAY_TYPE_ACTION));
        plays.add(new PLAY( "withGod", PLATY_TYPE_FANTASY));
        plays.add(new PLAY( "SpiderMan", PLAY_TYPE_ACTION));
        plays.add(new PLAY( "IronMan", PLAY_TYPE_ACTION));

        invoice.add(new INVOICE( 0, 550 ));
        invoice.add(new INVOICE( 1, 100 ));
        invoice.add(new INVOICE( 2, 200 ));
        invoice.add(new INVOICE( 3, 340 ));
    }

    public static void statement(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice) {
        int totalAmount = 0;
        int volumeCredits = 0;

        System.out.println("전체 영화 수 = " + plays.size());
        System.out.println("==========================");

        for (INVOICE perf : invoice) {
            PLAY play = plays.get(perf.playID);
            int thisAmount = getAmount(perf, play);
            volumeCredits += getVolumeCredits(perf, play);
            printInvoiceResult(perf, play, thisAmount);
            totalAmount += thisAmount;
        }
        printTotalResult(totalAmount, volumeCredits);
    }

    private static void printTotalResult(int totalAmount, int volumeCredits) {
        System.out.println("==========================");
        System.out.println("총액 : " + totalAmount);
        System.out.println("적립 포인트 : " + volumeCredits);
    }

    private static void printInvoiceResult(INVOICE perf, PLAY play, int amout) {
        System.out.print(play.name + " : ");
        System.out.print(amout + "원 (");
        System.out.println(perf.audience + ")");
    }

    private static int getVolumeCredits(INVOICE perf, PLAY play) {
        int volumeCredits = 0;
        if (perf.audience - 300 > 0) volumeCredits += perf.audience - 300;
        if (PLAY_TYPE_ACTION.equals(play.type)) volumeCredits += perf.audience / 5;
        return volumeCredits;
    }

    private static int getAmount(INVOICE perf, PLAY play) {
        int thisAmount = 0;
        if (PLAY_TYPE_ACTION.equals(play.type)) {
            thisAmount = BASIC_AMOUNT_ACTION;
            thisAmount += getAdditionalCostForAction(perf);
        }
        else if (PLATY_TYPE_FANTASY.equals(play.type)) {
            thisAmount = BASIC_AMOUNT_FANTASY;
            thisAmount += getAdditionalCostForFantasy(perf);
        }
        return thisAmount;
    }

    private static int getAdditionalCostForAction(INVOICE perf) {
        int amount = 0;
        if (perf.audience > AUDIENCE_BASIS_ACTION) {
            amount += ADD_COST_PER_AUDIENCE_ACTION * (perf.audience - AUDIENCE_BASIS_ACTION);
        }
        return amount;
    }

    private static int getAdditionalCostForFantasy(INVOICE perf) {
        int amount = 0;
        if (perf.audience > AUDIENCE_BASIS_FANTASY) {
            amount += ADD_COST_BASIS_FANTASY + ADD_COST_PER_AUDIENCE_FANTASY * (perf.audience - AUDIENCE_BASIS_FANTASY);
            amount += ADD_EXTRA_COST_PER_AUDIENCE_FANTASY * perf.audience;
        }
        return amount;
    }

}
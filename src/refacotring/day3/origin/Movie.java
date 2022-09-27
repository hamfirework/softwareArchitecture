package refacotring.day3.origin;

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

    public static ArrayList<PLAY> plays = new ArrayList<>();
    public static ArrayList<INVOICE> invoice = new ArrayList<>();

    public static void main(String[] args) {

        init();
        String resultStr = statement(plays, invoice);
        System.out.println(resultStr);
    }

    public static void init()
    {
        plays.add(new PLAY("SquidGame", "ACTION"));
        plays.add(new PLAY( "withGod", "FANTASY" ));
        plays.add(new PLAY( "SpiderMan", "ACTION" ));
        plays.add(new PLAY( "IronMan", "ACTION" ));

        invoice.add(new INVOICE( 0, 550 ));
        invoice.add(new INVOICE( 1, 100 ));
        invoice.add(new INVOICE( 2, 200 ));
        invoice.add(new INVOICE( 3, 340 ));
    }

    public static String statement(ArrayList<PLAY> plays, ArrayList<INVOICE> invoice) {
        int totalAmount = 0;
        int volumeCredits = 0;

        String str = "";
        str += "전체 영화 수 = " + plays.size() + "\n";
        str += "==========================\n";

        for (INVOICE perf : invoice) {
            PLAY play = plays.get(perf.playID);
            int thisAmount = 0;

            if (play.type == "ACTION") {
                //ACTION이면 단가 40000
                //단, 300명 초과시 다음 계산식에 의해 추가 비용 발생
                thisAmount = 40000;
                if (perf.audience > 300) {
                    thisAmount += 1000 * (perf.audience - 300);
                }
            }
            else if (play.type == "FANTASY") {
                thisAmount = 30000;
                //ACTION이면 단가 30000
                //단, 200명 초과시 다음 계산식에 의해 추가 비용 발생
                if (perf.audience > 200) {
                    thisAmount += 10000 + 500 * (perf.audience - 200);
                    thisAmount += 300 * perf.audience;
                }
            }

            //포인트 적립
            if (perf.audience - 300 > 0) volumeCredits += perf.audience - 300;
            if (play.type == "ACTION") volumeCredits += perf.audience / 5;

            str += play.name + " : ";
            str += thisAmount + "원 (";
            str += perf.audience + ")\n";

            totalAmount += thisAmount;
        }

        //청구 내역 출력
        str += "==========================\n";
        str += "총액 : " + totalAmount + "\n";
        str += "적립 포인트 : " + volumeCredits + "\n";

        return str;
    }
}
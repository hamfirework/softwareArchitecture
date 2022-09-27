package refacotring.oop;

import java.util.ArrayList;

public class GameMachine {

    public ArrayList<Package> romList = new ArrayList<>();

    private int coin = 0;

    public ArrayList<Package> getRomList() {
        return romList;
    }

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public int getCoin() {
        return coin;
    }

    public void addCoin(int n) {
        if (n >= 1 && n <= 5) {
            coin += n;
            if (coin > 10) coin = 10;
        }
        else {
            System.out.println("ERROR :: Wrong Input 1 - 5");
        }
    }

    public void useCoin() {
        this.coin--;
    }

    public void playRom(String packageName) {
        Package rom = null;
        for (int i = 0; i < romList.size(); i++) {
            if (romList.get(i).packageName.equals(packageName)) {
                rom = romList.get(i);
                break;
            }
        }
        if(rom == null) {
            System.out.println("ERROR :: THERE'S No Game");
            return;
        }
        rom.loadResource();
        rom.play();
        rom.gameOver();
        useCoin();
    }

    public void printMenu() {
        System.out.println("1. Input Coin");
        System.out.println("2. Play Game");
        System.out.println("3. Coin Status");
        System.out.println("4. Bye");
        System.out.println("=============");
        System.out.print("CMD? (1-4) ");
    }

    public void printCoinStatus() {
        System.out.println("================");
        System.out.println("Coin Status : " + coin);
    }

    public void printEnd() {
        System.out.println("BYE!");
    }

    public void printCoinMenu() {
        System.out.print("1-1. Coin Amount? (1-5) ");
    }

    public void printSelectGame() {
        System.out.println("Let's Play Game");
        System.out.print("Game Rom Name? (Dia2 or Star) : ");

    }

    public boolean isCoinExist() {
        if(coin > 0) return true;
        System.out.println("ERROR :: PLEASE Insert Coin");
        return false;
    }
}

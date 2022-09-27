package refacotring.oop;

import java.util.Scanner;


class Package {
    String packageName;
    int resourceCnt;
    int playCount;

    Package(String pName, int rCnt, int pCnt) {
        packageName = pName;
        resourceCnt = rCnt;
        playCount = pCnt;
    }

    public void loadResource() {
        System.out.print("Loading...");
        int g = 10;
        for (int i = 0; i < resourceCnt; i++) g = (g + i) * i % 7717;
        System.out.println("Finish");
    }

    public void play() {
       System.out.println("PlayGame! - " + packageName);
       this.playCount++;
    }

    public void gameOver() {
        System.out.println("GameOver!");
    }
}

public class GamePlay {

    public static void main(String[] args) {

        GameMachine gameMachine = new GameMachine();

        gameMachine.getRomList().add(new Package("Dia2", 340590193, 0));
        gameMachine.getRomList().add(new Package("Star", 221002142, 0));

        Scanner sc = new Scanner(System.in);
        while(true) {
            gameMachine.printMenu();
            int n = sc.nextInt();
            if (n == 1) {
                gameMachine.printCoinMenu();
                n = sc.nextInt();
                gameMachine.addCoin(n);
            }
            else if (n == 2) {
                if(gameMachine.isCoinExist()){
                    gameMachine.printSelectGame();
                    String str = sc.next();
                    gameMachine.playRom(str);
                }
            }
            else if (n == 3) {
                gameMachine.printCoinStatus();
            }
            else if (n == 4) {
                gameMachine.printEnd();
                break;
            }
            System.out.println("================\n");
        }
    }

}


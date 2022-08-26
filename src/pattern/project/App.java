package pattern.project;

import pattern.project.cleaner.CType;
import pattern.project.cleaner.Cleaner;
import pattern.project.cleaner.CleanerFactory;
import pattern.project.module.MType;
import pattern.project.observer.DustbinObserver;

public class App {

    public static void main(String[] args) {

        Cleaner robot = CleanerFactory.createCleaner(CType.ROBOT, "ROIDME");
        Cleaner wireless = CleanerFactory.createCleaner(CType.WIRELESS, "dreame");
        wireless.addSubscribe(MType.DUSTBIN, new DustbinObserver());

        robot.cleaning();
        robot.stopCleaning();
        System.out.println();

        wireless.cleaning();
        wireless.dustFull();

    }

}

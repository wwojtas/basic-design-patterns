package main.java.co.Patterns.Command;

import main.java.co.Patterns.Command.Workshop.CoffeMaker;
import main.java.co.Patterns.Command.Workshop.Robot;
import main.java.co.Patterns.Command.Workshop.WorkshopApp;
import main.java.co.Patterns.Command.Workshop.command.*;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        WorkshopApp workshopApp = new WorkshopApp();
//        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.addToQueue(new RobotCutCommand(robot));
//        workshopApp.addToQueue(new RobotDrillCommand(robot));
//        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
//
//        workshopApp.run();
//        workshopApp.run();
//
//        CoffeMaker coffeMaker = new CoffeMaker();
//        workshopApp.addToQueue(new CoffeMakerTurnOnCommand(coffeMaker));
//        workshopApp.addToQueue(new CoffeMakerTurnOffCommand(coffeMaker));
//        workshopApp.run();

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();
        workshopApp.undoLastCommand();


    }
}

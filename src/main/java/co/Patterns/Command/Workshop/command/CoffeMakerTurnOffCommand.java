package main.java.co.Patterns.Command.Workshop.command;

import main.java.co.Patterns.Command.Workshop.CoffeMaker;

public class CoffeMakerTurnOffCommand implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOffCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }
}

package main.java.co.Patterns.Command.Workshop.command;

import main.java.co.Patterns.Command.Workshop.CoffeMaker;

public class CoffeMakerTurnOnCommand implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOnCommand(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }


    @Override
    public void execute() {
        coffeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeMaker.turnOff();
    }
}

package main.java.co.Patterns.Visitor.visitor;

import main.java.co.Patterns.Visitor.activity.Squash;
import main.java.co.Patterns.Visitor.activity.Treadmill;
import main.java.co.Patterns.Visitor.activity.Weights;

public class VisitorImpl implements Visitor{


    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running: "
                + treadmill.getDistance() * 5);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: "
                + squash.getMinutesPlayed() * 20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories burned lifting weights: "
                + weights.getWeight() * weights.getReps() * 2);
    }
}

package main.java.co.Patterns.Visitor.activity;

import main.java.co.Patterns.Visitor.visitor.Visitor;

public class Treadmill implements Activity {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

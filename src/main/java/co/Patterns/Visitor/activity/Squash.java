package main.java.co.Patterns.Visitor.activity;

import main.java.co.Patterns.Visitor.visitor.Visitor;

public class Squash implements Activity {

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

package main.java.co.Patterns.Visitor.activity;

import main.java.co.Patterns.Visitor.visitor.Visitor;

public interface Activity {

    void accept(Visitor visitor);
}

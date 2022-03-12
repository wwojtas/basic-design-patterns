package main.java.co.Patterns.Visitor.visitor;

import main.java.co.Patterns.Visitor.activity.Squash;
import main.java.co.Patterns.Visitor.activity.Treadmill;
import main.java.co.Patterns.Visitor.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}

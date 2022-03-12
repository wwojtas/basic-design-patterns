package main.java.co.Patterns.Visitor;

import main.java.co.Patterns.Visitor.activity.Activity;
import main.java.co.Patterns.Visitor.activity.Squash;
import main.java.co.Patterns.Visitor.activity.Treadmill;
import main.java.co.Patterns.Visitor.activity.Weights;
import main.java.co.Patterns.Visitor.visitor.VisitorImpl;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Treadmill treadmill = new Treadmill(100);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50, 10);

        VisitorImpl visitor = new VisitorImpl();

        treadmill.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("-----------------------");

        List<Activity> activityList = Arrays.asList(treadmill, squash, weights);

        activityList.forEach(activity -> activity.accept(visitor));
    }
}

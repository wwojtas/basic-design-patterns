package main.java.co.Patterns.Command.Workshop;

public class Robot {

    public void turnOn(){
        System.out.println("Robot został włączony");
    }

    public void cut(){
        System.out.println("Robot tnie");
    }

    public void drill(){
        System.out.println("Robot wierci");
    }

    public void turnOff(){
        System.out.println("Robot wyłączony");
    }
}

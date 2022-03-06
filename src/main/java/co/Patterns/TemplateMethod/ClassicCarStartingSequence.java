package main.java.co.Patterns.TemplateMethod;


public class ClassicCarStartingSequence extends CarStartingSequence {

    public void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    public void startTheIgnition() {
        System.out.println("Przekręcamy kluczyk");
    }


}

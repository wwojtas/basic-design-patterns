package main.java.co.Patterns.Obserwator.order;

import main.java.co.Patterns.Obserwator.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}

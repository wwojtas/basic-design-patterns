package main.java.co.devfoundry.order;

import main.java.co.devfoundry.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}

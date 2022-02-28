package main.java.ZadaniaDoWykonania.WzorceProjektowe.Obserwator;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();

}

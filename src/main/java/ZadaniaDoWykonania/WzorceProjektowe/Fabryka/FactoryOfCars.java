package main.java.ZadaniaDoWykonania.WzorceProjektowe.Fabryka;

public interface FactoryOfCars {

    Car createFord(FordModel fordModel);
    Car createBmw(BMWModel bmwModel);
    void getSteringWheelPosition();


}

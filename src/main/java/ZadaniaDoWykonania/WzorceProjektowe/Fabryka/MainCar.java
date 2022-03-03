package main.java.ZadaniaDoWykonania.WzorceProjektowe.Fabryka;

import main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna.units.Factory;

public class MainCar {
    public static void main(String[] args) {

        FactoryOfCars factoryLeft = new LeftHandDriveCar();
        FactoryOfCars factoryRight = new RightHandDriveCar();

        factoryRight.createFord(FordModel.CMAX);
        factoryLeft.createBmw(BMWModel.E60);
    }
}

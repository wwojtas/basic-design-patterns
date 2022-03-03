package main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna;


import main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna.units.*;

public class MainFabryka {
    public static void main(String[] args) {

        Factory redFactory = new RedFactory();
        Factory bluefactory = new BlueFactory();


        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redInfantry = redFactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit redHelicopter = redFactory.createAirUnit(UnitType.HELICOPTER);

        MechanizedUnit blueTank = bluefactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueInfantry = bluefactory.createInfantryUnit(UnitType.RIFLEMAN);
        AirUnit blueHelicopter = bluefactory.createAirUnit(UnitType.HELICOPTER);


    }
}

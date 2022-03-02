package main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna.units;

public abstract class Factory {

    public abstract InfantryUnit createInfantryUnit(UnitType type);
    public abstract MechanizedUnit createMechanizedUnit(UnitType type);


}

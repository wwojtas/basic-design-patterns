package main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna.units;

public class RedFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(20,0,6);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(75,0,35);
            default:
                throw  new UnsupportedOperationException("Nieznany typ ");
        }
    }
}

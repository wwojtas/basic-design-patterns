package main.java.co.Patterns.Fabryka.FabrykaAbstrakcyjna.units;

public class BlueFactory extends Factory{

    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(25,0,5);
            default:
                throw new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type) {
            case TANK:
                return new Tank(100,0,25);
            default:
                throw  new UnsupportedOperationException("Nieznany typ ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type) {
            case HELICOPTER:
                return new AirHelicopter(48,0,48);
            default:
                throw  new UnsupportedOperationException("Nieznany typ ");
        }
    }
}

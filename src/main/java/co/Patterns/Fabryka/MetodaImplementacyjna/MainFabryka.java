package main.java.co.Patterns.Fabryka.MetodaImplementacyjna;

import main.java.co.Patterns.Fabryka.MetodaImplementacyjna.units.Factory;
import main.java.co.Patterns.Fabryka.MetodaImplementacyjna.units.Unit;
import main.java.co.Patterns.Fabryka.MetodaImplementacyjna.units.UnitFactory;
import main.java.co.Patterns.Fabryka.MetodaImplementacyjna.units.UnitType;

public class MainFabryka {
    public static void main(String[] args) {

        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit infantryman = factory.createUnit(UnitType.RIFLEMAN);
    }
}

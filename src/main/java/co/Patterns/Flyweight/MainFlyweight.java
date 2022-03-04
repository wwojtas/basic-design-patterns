package main.java.co.Patterns.Flyweight;

import main.java.co.Patterns.Flyweight.flyweightPackage.Destroyer;
import main.java.co.Patterns.Flyweight.flyweightPackage.Rifleman;
import main.java.co.Patterns.Flyweight.flyweightPackage.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class MainFlyweight {
    public static void main(String[] args) {

        List<Object> activeUnit = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            activeUnit.add(new TeslaTank(0,0));
            activeUnit.add(new Rifleman(0,0));
            activeUnit.add(new Destroyer(0,0));
        }
    }
}

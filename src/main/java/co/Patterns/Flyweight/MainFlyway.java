package main.java.co.Patterns.Flyweight;

import main.java.co.Patterns.Flyweight.flyweightPackage.Destroyer;
import main.java.co.Patterns.Flyweight.flyweightPackage.Rifleman;
import main.java.co.Patterns.Flyweight.flyweightPackage.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class MainFlyway {
    public static void main(String[] args) {

        List<Object> activeUnit = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++) {
            activeUnit.add(new TeslaTank("Tesla Tank", 200, 100,50, 25, 0, 0, 500));
            activeUnit.add(new Rifleman("Rifleman", 25,5,20,25,0,0,50));
            activeUnit.add(new Destroyer("Destroyer", 500, 250,70,10,0,0,800));
        }
    }
}

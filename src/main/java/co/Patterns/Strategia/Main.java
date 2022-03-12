package main.java.co.Patterns.Strategia;

import main.java.co.Patterns.Strategia.chef.Chef;
import main.java.co.Patterns.Strategia.chef.egg_cooker.HardBoiledEggCooker;
import main.java.co.Patterns.Strategia.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        // nowe zamowienie - jajka na twardo
        Chef chef = new Chef("Szef Kuchni");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();

        // kolejne zamowienie - jajka na miękko
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}

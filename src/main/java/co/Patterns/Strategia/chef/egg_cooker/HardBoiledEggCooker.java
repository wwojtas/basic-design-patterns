package main.java.co.Patterns.Strategia.chef.egg_cooker;

public class HardBoiledEggCooker implements EggCooker {

    @Override
    public void cookEgg() {
        System.out.println("Gotuję jajka na twardo");
    }
}

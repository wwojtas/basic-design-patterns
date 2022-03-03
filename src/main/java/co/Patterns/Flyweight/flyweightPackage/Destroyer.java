package main.java.co.Patterns.Flyweight.flyweightPackage;

public class Destroyer {

    private int x;
    private int y;
    private int hpLeft;


    public Destroyer(String name, int hp, int armour, int damageDealt, int speed, int x, int y, int resourceCost) {
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.hpLeft = hp;
        this.resourceCost = resourceCost;
    }
}

package main.java.co.Patterns.Flyweight.flyweightPackage;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250,70,10,800);
    private static UnitStats teslaTankUnitStats = new UnitStats("Tesla Tank", 200, 100,50, 25, 500);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 25, 10,5, 5, 50);

    private UnitStatsRepository() {}

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getTeslaTankStats(){
        return teslaTankUnitStats;
    }


    public static UnitStats getRiflemanStats() {
        return riflemanUnitStats;
    }
}

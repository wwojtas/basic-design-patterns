package main.java.co.Patterns.Flyweight.flyweightPackage;

public class UnitStatsRepository {

    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250,70,10,800);
    private static UnitStats teslaTankUnitStats = new UnitStats("Tesla Tank", 200, 100,50, 25, 500);

    private UnitStatsRepository() {}

    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }

    public static UnitStats getTeslaTankUnitStats(){
        return teslaTankUnitStats;
    }



}

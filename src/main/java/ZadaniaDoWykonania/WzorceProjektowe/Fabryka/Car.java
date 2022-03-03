package main.java.ZadaniaDoWykonania.WzorceProjektowe.Fabryka;

public abstract class Car {

    private float engineCapacity;
    private String typeOfFuel;
    private int yearProduction;

    public Car(float engineCapacity, String typeOfFuel, int yearProduction) {
        this.engineCapacity = engineCapacity;
        this.typeOfFuel = typeOfFuel;
        this.yearProduction = yearProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public int getYearProduction() {
        return yearProduction;
    }
}

package main.java.co.Patterns.Builder.BuilderWersjaKlasyczna;

public interface HouseBuilder {

    void buidWalls();
    void buildFloors();
    void buildRooms();
    void buildRoof();
    void buildWindows();
    void buildDoors();
    void buildGarage();

    House getHouse();
}

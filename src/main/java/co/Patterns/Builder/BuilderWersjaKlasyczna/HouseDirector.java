package main.java.co.Patterns.Builder.BuilderWersjaKlasyczna;

public class HouseDirector {

    private HouseBuilder houseBuilder;

    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void buildHouse(){
        houseBuilder.buidWalls();
        houseBuilder.buildFloors();
        houseBuilder.buildRooms();
        houseBuilder.buildRoof();
        houseBuilder.buildWindows();
        houseBuilder.buildDoors();
        houseBuilder.buildGarage();
    }

    public House getHouse(){
        return this.houseBuilder.getHouse();
    }

}

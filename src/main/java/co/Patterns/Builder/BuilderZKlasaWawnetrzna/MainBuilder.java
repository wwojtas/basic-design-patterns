package main.java.co.Patterns.Builder.BuilderZKlasaWawnetrzna;

public class MainBuilder {
    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildFloors("floors")
                .buildRoof("roof")
                .buildRooms("rooms")
                .build();
        System.out.println(house);

    }
}

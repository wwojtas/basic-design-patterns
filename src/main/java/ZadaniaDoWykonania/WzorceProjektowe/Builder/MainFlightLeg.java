package main.java.ZadaniaDoWykonania.WzorceProjektowe.Builder;

public class MainFlightLeg {
    public static void main(String[] args) {

        FlightLeg leg = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles")
                .price(50)
                .build();

        System.out.println(leg);
    }
}

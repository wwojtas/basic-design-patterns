package main.java.ZadaniaDoWykonania.WzorceProjektowe.Obserwator;

public class RadioNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Radio - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, "  + "cisnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}

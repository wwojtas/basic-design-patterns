package main.java.ZadaniaDoWykonania.WzorceProjektowe.Obserwator;

public class TvNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Telewizja - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, "  + "cisnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}

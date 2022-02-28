package main.java.ZadaniaDoWykonania.WzorceProjektowe.Obserwator;

public class InternetNews implements Observer{
    @Override
    public void updateForecast(WeatherForecast weatherForecast) {
        System.out.println("Internet - nowa prognoza pogody: temperatura: "
                + weatherForecast.getTemperature() + " stopni, "  + "cisnienie: "
                + weatherForecast.getPressure() + "hPa");
    }
}

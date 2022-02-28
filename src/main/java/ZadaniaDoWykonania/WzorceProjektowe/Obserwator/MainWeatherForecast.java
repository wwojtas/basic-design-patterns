package main.java.ZadaniaDoWykonania.WzorceProjektowe.Obserwator;

public class MainWeatherForecast {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(21,1013);
        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();
        weatherForecast.unregisterObserver(radioNews);
        System.out.println("-----------");
        weatherForecast.notifyObservers();

    }
}

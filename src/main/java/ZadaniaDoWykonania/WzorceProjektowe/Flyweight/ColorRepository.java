package main.java.ZadaniaDoWykonania.WzorceProjektowe.Flyweight;

public class ColorRepository {

    private static Color black = new Color(255,255,255);
    private static Color white = new Color(0,0,0);


    public ColorRepository() {}

    public static Color getWhite() {
        return white;
    }

    public static Color getBlack() {
        return black;
    }
}

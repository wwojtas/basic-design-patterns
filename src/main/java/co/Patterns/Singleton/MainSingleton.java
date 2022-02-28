package main.java.co.Patterns.Singleton;

public class MainSingleton {
    public static void main(String[] args) {

        GameEngine engine1 = GameEngine.getInstance();
        GameEngine engine2 = GameEngine.getInstance();

        System.out.println(engine1 == engine2);

    }
}

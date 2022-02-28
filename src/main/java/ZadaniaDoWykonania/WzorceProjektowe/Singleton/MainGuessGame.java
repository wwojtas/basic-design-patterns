package main.java.ZadaniaDoWykonania.WzorceProjektowe.Singleton;

public class MainGuessGame {
    public static void main(String[] args) {

        GuessGame guessGame = GuessGame.getInstance();

        guessGame.play();
    }
}

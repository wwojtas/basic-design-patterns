package main.java.ZadaniaDoWykonania.WzorceProjektowe.Singleton;

public class GuessGame {

    private int number = 10;
    private int score = 0;
    private static GuessGame game;

    private GuessGame(){};

    public void play(){
        while(number-- > 0){

        }
    }

    public static GuessGame getInstance(){
        if(game == null) {
            synchronized (GuessGame.class){
                if (game == null) {
                    game = new GuessGame();
                }
            }
        }
        return game;
    }

    public int getScore() {
        return score;
    }

}

package main.java.co.Patterns.Singleton;

public class GameEngine {

    // if serialization problem  -- FIRST
//    private static final long serialVersionID = 23232323;

    private int hp = 100;
    private String characterName = "";
    private static GameEngine instance;

    // or 2 second way -- SECOND
    //    private static GameEngine instance = new GameEngine();


    private GameEngine(){};

    public void run(){
        while (true){
            // wait for gamer intput
            // game state change
            // render graphics
        }
    }

    public static GameEngine getInstance(){
        if (instance == null) {
            synchronized (GameEngine.class){
                if (instance == null){
                    instance = new GameEngine();
                }
            }
        }
        return instance;
    }

    // or 2 second way -- SECOND
    //    private static GameEngine instance = new GameEngine();

//    public static GameEngine getInstance(){
//        return instance;
//    }

    // if serialization problem  -- FIRST
//    protected Object readResolve(){
//        return getInstance();
//    }


}

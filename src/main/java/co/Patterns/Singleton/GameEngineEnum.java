package main.java.co.Patterns.Singleton;

public enum GameEngineEnum {

    INSTANCE("Duke");
    private int hp = 100;
    private String characterName = "";

    private GameEngineEnum(String name){
        this.characterName = name;
    }

    public void run(){
        while (true){
            // wait for gamer intput
            // game state change
            // render graphics
        }
    }

}

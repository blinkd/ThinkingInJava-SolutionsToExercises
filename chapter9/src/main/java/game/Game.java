package game;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

public interface Game {
    boolean move();
}

interface GameFactory{
    Game getGame();
}

class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory{
    public Game getGame(){return new Checkers();}
}

public class Games{
    public static void playGame(GameFactory factory){
        Game s = factory.getGame();

    }
}
package Ex19;

import java.util.Random;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

interface Games{
    void play();
}

interface GamesFactory{
    Games getGames();
}

class CoinToss implements Games{
    Random random = new Random();
    public void play(){
        System.out.println("Toss Coin:  ");
        switch (random.nextInt(2)) {
            case 0: println("Heads"); return;
            case 1: println("Tails"); return;
            default: println("onEdge"); return;
        }
    }
}

class CoinTossFactory implements GamesFactory{
    public Games getGames(){
        return new CoinToss();
    }

}

class DiceThrow implements Games{
    Random rand = new Random();
    public void play(){
        println("throw dice "+ (rand.nextInt(6) + 1));
    }
}

class DiceThrowFactory implements GamesFactory{
    public Games getGames(){
        return new DiceThrow();
    }
}

public class Games19 {
    public static void playGame(GamesFactory factory){
        Games g = factory.getGames();
        g.play();
    }
    public static void main(String[] args){
        playGame(new CoinTossFactory());
        playGame(new DiceThrowFactory());
    }
}

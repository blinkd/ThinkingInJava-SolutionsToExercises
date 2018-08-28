package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Stringed extends Instrument {
    void play(Note n){
        println("Stringed.play()" + n);
    }
    String what(){
        return "Stringed";
    }
    void adjust(){
        println("Adjusting Stringed");
    }
}

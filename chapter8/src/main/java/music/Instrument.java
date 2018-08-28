package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Instrument {
    void play(Note n){
        println("Instrument.play()" + n );
    }
    String what(){return "Instrument";}
    void adjust(){println("Adjusting Instrument");}
}

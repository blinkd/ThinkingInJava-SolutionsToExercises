package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Percussion extends Instrument {
    void play(Note n ){
        println("Percussion,play()" + n);
    }

    String what(){return "wind";}
    void adjust(){println("Adjusting wind");}
}

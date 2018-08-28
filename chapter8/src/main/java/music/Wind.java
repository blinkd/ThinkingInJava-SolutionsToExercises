package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Wind extends Instrument {
    void play(Note n){
        println("wind.play()" + n);
    }

    String what() {
        return "Wind";
    }
    void adjust(){
        println("Adjusting wind");
    }
}

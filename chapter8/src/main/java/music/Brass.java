package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Brass extends Wind {
    void play(Note n ){
        println("Brass.play()" + n);
    }
    void adjust() {
        println("adjusting Brass");
    }

}

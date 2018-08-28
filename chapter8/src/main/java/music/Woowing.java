package music;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Woowing extends Wind {
    void play(Note n){
        println("Woowing.play()" + n);
    }
    String what()
    { return "Woodwing";}
}

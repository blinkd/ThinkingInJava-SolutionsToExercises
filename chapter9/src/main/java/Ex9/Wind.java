package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Wind extends Instrument {
    public void play(Note n){
        println(this + "wind.play()" + n);
    }

    public String toString() {
        return "Wind";
    }
    public void adjust(){
        println(this + "Adjusting wind");
    }
}

package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Percussion extends Instrument {
    public void play(Note n ){
        println(this + "Percussion,play()" + n);
    }

    public String toString(){return "wind";}
    public void adjust(){println(this + "Adjusting wind");}
}

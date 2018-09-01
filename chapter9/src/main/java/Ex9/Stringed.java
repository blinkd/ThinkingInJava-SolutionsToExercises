package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Stringed extends Instrument {
    public void play(Note n){
        println(this +"Stringed.play()" + n);
    }
    public String toString(){
        return "Stringed";
    }
    public void adjust(){
        println(this + "Adjusting Stringed");
    }
}

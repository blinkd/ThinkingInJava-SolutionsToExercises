package Ex10;


import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Stringed implements Instrument, Playable {
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

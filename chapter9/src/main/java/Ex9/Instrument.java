package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

abstract class Instrument {
    private int VALUE = 5;
    public abstract void play(Note n);
    public abstract void adjust();
}

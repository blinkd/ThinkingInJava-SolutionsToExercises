package Ex1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

abstract class Rodent {
    private String name = "Rodent";
    protected abstract void eat();
    protected abstract void run() ;
    protected abstract void sleep();

    public String toString() {return name;}

}

package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Rat extends Rodent {
    private String name = "Rat";
    protected void eat() {println("Rat.eat()");}
    protected void run() {println("Rat.run()");}
    protected void sleep() {println("Rat.sleep()");}

    public String toString(){return name;}
}

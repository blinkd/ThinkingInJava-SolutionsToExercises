package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Rodent {
    private String name = "Rodent";
    protected void eat() {println("Rodent.eat()");}
    protected void run() {println("Rodent.run()");}
    protected void sleep() {println("Rodent.sleep()");}

    public String toString() {return name;}

}

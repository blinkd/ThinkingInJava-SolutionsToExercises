package Ex1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Squirrel extends Rodent {
    private String name = "Squirrel";
    protected void eat() {println("Squirrel.eat()");}
    protected void sleep() {println("Squirrel.sleep()");}
    protected void run() {println("Squirrel.run()");}
    public String toString() {return  name;}
}

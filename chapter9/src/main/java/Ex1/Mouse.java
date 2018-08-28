package Ex1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Mouse extends Rodent {
    private String name ="Mouse";
    protected void eat() {println("Mouse.eat()");}
    protected void run() {println("Mouse.run()");}
    protected void sleep() {println("Mouse.sleep()");}

    public String toString() {return name;}

}

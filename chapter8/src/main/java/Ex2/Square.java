package Ex2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;


public class Square extends Shape {
    @Override public void draw() {println("Square.draw()");}
    @Override public void erase() {println("Square.erase()");}
}

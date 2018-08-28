package Ex2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Triangle extends Shape {
    @Override public void draw(){ println("Triangle.draw()");}
    @Override public void erase(){println("Triangle.erase()");}
}

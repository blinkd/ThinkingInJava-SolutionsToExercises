package Ex2;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Circle extends Shape {
    @Override public void draw(){println("Circle.draw()");}
    @Override public void erase(){println("Circle.erase()");}
}

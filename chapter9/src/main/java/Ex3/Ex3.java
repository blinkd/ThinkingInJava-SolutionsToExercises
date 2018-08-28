package Ex3;

import java.text.DateFormat;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;


abstract class Dad{
    abstract void print();
    Dad(){print();}
}

class Son extends Dad{
    private int i = 1;
    void print(){
        println("Son.i = " + i);
    }
}
//初始化顺序
//抽象类构造函数调用继承类的方法
public class Ex3 {
    public static void main(String[] args){
        Son s = new Son();
        s.print();
    }
}

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
//��ʼ��˳��
//�����๹�캯�����ü̳���ķ���
public class Ex3 {
    public static void main(String[] args){
        Son s = new Son();
        s.print();
    }
}

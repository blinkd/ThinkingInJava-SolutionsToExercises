package Ex4;

import java.text.DateFormat;

class Dad{

}

class Son extends Dad{
    protected void print(){System.out.println("Son");}
}


abstract class SecondDad{
    abstract protected void print();
}

class SecondSon extends SecondDad{
    protected void print(){System.out.println("SecondSon");}
}


public class Ex4 {
    //接受一向基类的引用 然后将其向下转型至导出类
    public static void testPrint(Dad d){
        ((Son)d).print();
    }

    //抽象基类与普通基类的区别
    // 1 初始化顺序 与构造器的调用顺序
    // 2 向上转型与向下转型
    // 问题：抽象方法与普通方法 抽象类与普通类的区别 的具体区别
    // 原文：抽象类是重要的重构工具 他们可以使我们很容易的将公共方法沿着继承层次结构向上移动
    // 例如ex3中的print在抽象类中的构造器的调用
    // 例如ex4中的基类引用向上转型与调用继承类方法的向下转型在抽象类中的省略

    //动态绑定机制
    public static void secondTestPrint(SecondDad sd){
        sd.print();
    }

    public static void main(String[] args){
        Son s = new Son();
        Ex4.testPrint(s);

        SecondDad ss = new SecondSon();
        Ex4.secondTestPrint(ss);
    }

}

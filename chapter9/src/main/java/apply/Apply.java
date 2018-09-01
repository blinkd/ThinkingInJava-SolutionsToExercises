package apply;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Apply {
    //向下转型至基类调用方法

    //策略模式  根据所传递的参数对象不同而具有不同行为的方法 称为策略模式
    //耦合
    public static void process(Processor p, Object s){
        println("Using Processor  " + p.name() );
        System.out.println(p.process(s));
    }
}

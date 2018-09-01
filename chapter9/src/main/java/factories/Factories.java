package factories;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;
//工厂模式
//如果不是工厂方法  就需要在某处指定将要创建的Service模型

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{
    Implementation1(){}
    public void method1(){println("Implementation1 method1");}
    public void method2(){println("Implementation2 method2");}

}

class ImplementationiFactory implements ServiceFactory{
    public Service getService(){
        return new Implementation1();
    }
}

class Implementation2 implements Service{
    Implementation2(){}
    public void method1(){println("Implementation2 method1");}
    public void method2(){println("Implementation2 method2");}
}

class Implementation2Factory implements ServiceFactory{
    public Service getService(){
        return new Implementation2();
    }
}

public class Factories{
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args){
        serviceConsumer(new ImplementationiFactory());

        serviceConsumer(new Implementation2Factory());
    }
}
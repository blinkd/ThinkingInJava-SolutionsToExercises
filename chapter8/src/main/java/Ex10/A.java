package Ex10;


public class A {
    protected void f(){
        System.out.println("A.f()");
        this.g();
    }
    protected void g(){
        System.out.println("A.g()");
    }
}

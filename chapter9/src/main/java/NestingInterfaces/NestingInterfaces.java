package NestingInterfaces;

public class A {

    //class b
    interface B{
        void f();
    }
    public class Bimp implements B{
        public void f(){}
    }
    public class Bimp2 implements B{
        public void f(){}
    }

    //class c
    public interface C{
        void f();
    }
    class  Cimp implements C{
        public void f(){}
    }

    private class  Cimp2 implements C{
        public void f(){}
    }

    private interface D{
        void f();
    }

    public class Dimp implements D{
        public void f(){}
    }

    public class Dimp2 implements D{
        public void f(){}
    }

    public D getD(){return new Dimp2();}

    private D dRef;

    public void receiveD(D d){
        dRef = d;
        dRef.f();
    }
}

interface E{
    interface G{
        void f();
    }

    public interface H{
        void f();
    }

    void g();
}

public class NestingInterfaces {
    public class Bimp implements A.B {
        public void f(){}
    }

    class Cimp implements A.C{
        public void f(){}
    }

    class EImp implements E{
        public void g(){}
    }

    class EImp2 implements E {
        public void g(){}
        class EG implements E.G{
            public void f(){}
        }
    }
    public static void main(String[] args){
        A a = new A();

    }
}
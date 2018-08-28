package Ex2;

abstract class Nogo1{
    Nogo1(){System.out.println("Nogo1()");}
}

abstract class Nogo2{
}

class Go1 extends Nogo1{
    Go1(){System.out.println("Go1()");}
}
public class Ex2 {
    public static void main(String[] args){
//        Nogo1 ng1 = new Nogo1();
        Go1 g1 = new Go1();
    }
}

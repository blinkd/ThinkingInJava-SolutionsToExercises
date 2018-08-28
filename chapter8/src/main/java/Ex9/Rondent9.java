package Ex9;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Rondent9 {
    private static RandomRondentGenerator gen = new RandomRondentGenerator();

    public static void main(String[] args){

        Rodent[] rodents = new Rodent[10];
        for(Rodent r:rodents){
            r = gen.next();
            println(r + ":");
            r.eat();
            r.run();
            r.sleep();
        }
    }
}

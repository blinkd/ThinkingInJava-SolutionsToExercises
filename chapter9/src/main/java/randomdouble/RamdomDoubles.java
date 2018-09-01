package randomdouble;

import java.util.Random;

public class RamdomDoubles {
    private static Random rand = new Random(47);
    public double next() {
        //0.0到1.0之间的随机值
        return rand.nextDouble();
    }
    public static void main(String[] args){
        RamdomDoubles rd = new RamdomDoubles();
        for(int i = 0;i < 7; i ++){
            System.out.print(rd.next() + " ");
        }
    }

}

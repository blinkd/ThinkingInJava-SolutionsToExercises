package randomdouble;

import java.util.Random;

public class RamdomDoubles {
    private static Random rand = new Random(47);
    public double next() {
        //0.0��1.0֮������ֵ
        return rand.nextDouble();
    }
    public static void main(String[] args){
        RamdomDoubles rd = new RamdomDoubles();
        for(int i = 0;i < 7; i ++){
            System.out.print(rd.next() + " ");
        }
    }

}

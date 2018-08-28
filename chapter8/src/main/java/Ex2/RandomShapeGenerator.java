package Ex2;


import java.util.Random;

//工厂函数自动生成
public class RandomShapeGenerator {
    //random seed机制
    private Random rand = new Random(47);
    public Shape next(){
        switch(rand.nextInt(3)){
            default:
            case 0:return new Circle();
            case 1:return new Square();
            case 2:return new Triangle();
        }
    }
}

package Ex12;

public class Adventure {
    public static void t(Canfight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void c(CanClimb x){
        x.climb();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args){
        Hero h = new Hero();
        //使用接口的原因：为了能够向上转型为多个基类型以及由此带来的灵活性
        //为了防止客户端程序员创建该类的对象
        //
        t(h);
        u(h);
        v(h);
        w(h);
        c(h);
    }
}

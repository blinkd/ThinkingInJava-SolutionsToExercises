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
        //ʹ�ýӿڵ�ԭ��Ϊ���ܹ�����ת��Ϊ����������Լ��ɴ˴����������
        //Ϊ�˷�ֹ�ͻ��˳���Ա��������Ķ���
        //
        t(h);
        u(h);
        v(h);
        w(h);
        c(h);
    }
}

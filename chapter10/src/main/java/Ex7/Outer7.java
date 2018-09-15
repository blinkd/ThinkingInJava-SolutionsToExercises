package Ex7;

// 内部类可以修改外围类的对象

public class Outer7 {
    private int oi =1;
    private void hi(){System.out.println("Outer hi");}
    class Inner{
        void modifyOuter(){
            oi *= 2;
            hi();
        }
    }

    public void showOi(){ System.out.println(oi);}

    void textInner(){
        Inner in = new Inner();
        in.modifyOuter();
    }

    public static void main(String[] args){
        Outer7 out = new Outer7();
        out.showOi();
        out.textInner();
        out.showOi();

    }
}

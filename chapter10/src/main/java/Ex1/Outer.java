package Ex1;


//内部类的创建   外部类的方法返回内部类引用
public class Outer {
    private String outerContent;

    Outer(String str){
        this.outerContent = str;
    }



    class Inner{
        Inner(){
            System.out.println("Inner class has initial");
        }

        public String toString(){
            return outerContent;
        }

    }

    public void ship(String s){
        Outer i = new Outer(s);
        System.out.println(i.toString());
    }

    public Inner re(){
        return new Inner();
    }

    public static void main(String[] args){

        //外部引用创建
        Outer outer = new Outer("test");
        Inner inner = outer.re();
        System.out.println(inner.toString());

    }
}

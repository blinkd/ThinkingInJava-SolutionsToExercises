package Ex1;


//�ڲ���Ĵ���   �ⲿ��ķ��������ڲ�������
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

        //�ⲿ���ô���
        Outer outer = new Outer("test");
        Inner inner = outer.re();
        System.out.println(inner.toString());

    }
}

package DoThis;

public class DoThis {
    void f(){
        System.out.println("DonThis.f()");
    }

    public class Inner{
        public DoThis outer(){
            //�ڲ��������ⲿ�����
            return DoThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        DoThis dt = new DoThis();

        //���������ڲ���
        DoThis.Inner dti = dt.inner();

        //.new���������ڲ��� ��ʹ���ⲿ����󴴽��ڲ������
        DoThis.Inner dt2 = dt.new Inner();

        dti.outer().f();
        dt2.outer().f();
    }
}

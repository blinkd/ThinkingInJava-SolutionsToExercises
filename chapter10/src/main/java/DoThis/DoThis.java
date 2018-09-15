package DoThis;

public class DoThis {
    void f(){
        System.out.println("DonThis.f()");
    }

    public class Inner{
        public DoThis outer(){
            //内部类引用外部类对象
            return DoThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args){
        DoThis dt = new DoThis();

        //方法创建内部类
        DoThis.Inner dti = dt.inner();

        //.new方法创建内部类 ：使用外部类对象创建内部类对象
        DoThis.Inner dt2 = dt.new Inner();

        dti.outer().f();
        dt2.outer().f();
    }
}

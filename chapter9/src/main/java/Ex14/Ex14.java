package Ex14;

public class Ex14 {
    public static void m1(History history){history.v();}
    public static void m2(Exam exam){exam.w();}
    public static void m3(Labs labs){labs.y();}
    public static void m4(Workup workup){workup.zz();}
    public static void main(String[] args){
        Anesthesiologist anes = new Anesthesiologist();
        m1(anes);
        m2(anes);
        m3(anes);
        m4(anes);
    }
}

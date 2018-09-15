package Ex5;

public class OtherOuter {
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();
    }
}

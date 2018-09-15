package Ex11;

class Test {
    //向上转型
    private class Inner implements Ex11Interface {
        public void say(String s) {
            System.out.println(s);
        }
    }
    Ex11Interface f(){
        return new Inner();
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Test t = new Test();
        t.f().say("hi");
    }
}

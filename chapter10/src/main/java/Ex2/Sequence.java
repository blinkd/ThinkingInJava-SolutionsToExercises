package Ex2;

import com.sun.awt.SecurityWarning;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class S{

    private String s ;
    S(String str){
        this.s = str;
    }
    public String toString(){
        return s;
    }
}


public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }

    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }

    //内部类可以访问外围类的private字段
    private class SequenceSelector implements Selector{
        private int i = 0;
        public boolean end() {return i == items.length;}
        public Object current() {return items[i];}
        public void next() {if(i < items.length) i++; }
        public Sequence sequence() { return Sequence.this; }
    }


    public Selector selector(){
        return new SequenceSelector();
    }

    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++){
            S str = new S(String.valueOf(i));

            sequence.add(str.toString());
        }
        Selector selector = sequence.selector();

        while(!selector.end()){
            System.out.println(selector.current() + " ");
            selector.next();
        }

    }

}

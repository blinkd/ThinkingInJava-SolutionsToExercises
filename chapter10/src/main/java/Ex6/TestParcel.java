package Ex6;

class Parcel4{
    //private �ڲ������ͨ��return����
    //��ȫ����ʵ��ϸ��
    private class Pcontents implements Contents{
        private int i = 11;
        public int value() { return i;}
    }

    protected class PDextination implements Destination {
        private String label;
        private PDextination(String whereTo){
            label = whereTo;
        }
        public String readLabel() {return label;}
    }

    //�ڲ���Ĺ���
    public Destination destination(String s){
        return new PDextination(s);
    }

    public Contents contents(){
        return new Pcontents();
    }

}

public class TestParcel {
    public static void main(String[] args){
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }

}

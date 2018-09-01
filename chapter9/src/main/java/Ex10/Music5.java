package Ex10;

public class Music5 {
    //����ת�� ���ӿ��� ֻ�ǵ���play�ӿ�
    public static void tune(Playable i){
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Playable[] e){
        for(Playable i:e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woowing(),
        };
        tuneAll(orchestra);

        String s = "";
        s = null;
        System.out.println(s);
    }
}

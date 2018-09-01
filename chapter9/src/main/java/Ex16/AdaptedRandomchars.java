package Ex16;

import randomdouble.AdapteRandomDoubles;
import sun.audio.AudioDataStream;

import java.nio.CharBuffer;
import java.util.Scanner;

public class AdaptedRandomchars extends RandomChars implements Readable {
    private int count;
    public AdaptedRandomchars (int count){
        this.count = count;
    }

    public int read(CharBuffer ch){
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        ch.append(result);
        return result.length();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(new AdapteRandomDoubles(10));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }

}

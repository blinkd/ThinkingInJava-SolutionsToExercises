package Parcel5;

import Ex6.Destination;

public class Parcel5 {

    //向上转型 pdestination
    public Destination destination(String s){
        //方法类域
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo){
                label = whereTo;
            }
            public String readLabel(){return label;}
        }

        return new PDestination(s);

    }

    public static void main(String[] args){
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}

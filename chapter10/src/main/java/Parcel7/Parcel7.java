package Parcel7;

import Ex6.Contents;

public class Parcel7 {
    public Contents contents(){
        return new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        }
    }
}

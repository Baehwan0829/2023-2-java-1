package com.green.mynote.month10.java1005;

public class ArrayRe {
    public static void main(String[] args) {
        int[] uli = new int[100];
        int[] hi = new int[uli.length+1];
        //
        for (int i=0; i<uli.length; i++) {
            hi[i] = uli[i];
        }
        //
        hi[uli.length] = 25;
        for (int i=0; i<hi.length; i++) {
            System.out.printf   ("hi[%d] : %d\n", i, hi[i]);
        }
    }
}

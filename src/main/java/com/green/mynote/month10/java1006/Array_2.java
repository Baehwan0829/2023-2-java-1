package com.green.mynote.month10.java1006;

public class Array_2 {
    public static void main(String[] args) {
        // deep copy
        int i = 0;
        //
        System.out.println("deep copy");
        System.out.println("----------------");
        int[] wun = new int[3];
        int[] zen = new int[wun.length+1];
        //
        for(i=0; i< wun.length; i++){
            zen[i] = wun[i];
            System.out.println(zen[i]);
        }
        System.out.println("----------------");
        zen[wun.length] = 50;
        for(i=0; i< zen.length; i++){
            System.out.println(zen[i]);
        }
        //
        System.out.println("shallow copy");
        System.out.println("----------------");
        for(i=0; i< wun.length; i++){
            System.out.println(wun[i]);
        }
        System.out.println("----------------");
        zen = wun; // 얕은 복사시 [i]는 할 필요없다.
        //
        wun[0] = 5;
        zen[2] = 10;
        //
        for (i=0; i< wun.length; i++){
            System.out.println(wun[i]);
        }
        System.out.println("----------------");
        for (i=0; i< zen.length; i++){
            System.out.println(zen[i]);
        }
    }
}

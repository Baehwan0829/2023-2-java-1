package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args){
        String[] names = {"Kim", "Park", "Yi    "}; // String 배열
        //
        for(int i=0; i<names.length; i++){
            System.out.printf("names[%d] : %s\n" , i, names[i]);
        }
        System.out.println("=========");
        //
        names[1] = "Woo";
        System.out.println(Arrays.toString(names));
        System.out.println("=========");
        //
        int z = 0;
        for(String str : names){ // foreach , 향상된 for문
            System.out.printf("namse[%d] : %s\n", z++, str);
        }
        System.out.println("=========");
        //
        for(int i=0; i<names.length; i++){
            String str = names[i];
            System.out.println(str);
        }
    }
}

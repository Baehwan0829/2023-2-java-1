package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission2 {
    public static void main(String[] args) {
        int[] arr = {5,10,7,3,11};
        System.out.println(Arrays.toString(arr));
        int commlen = arr.length - 1;
        //
        System.out.println("------------------");
        //
        System.out.print("[");
        for(int i=0; i<commlen; i++){
            System.out.print(arr[i]);
            if(i < commlen){
                System.out.print(",");
            }
        }
        System.out.println("]");
        //
        System.out.println("------------------");
        // , 코마를 먼저 찍고 숫자를 후에 출력 될 때
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i != 0) {
                System.out.print(",");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }
}

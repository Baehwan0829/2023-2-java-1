package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission3 {
    public static void main(String[] args) {
        int[] arr = {5,10,7,3,11};
        System.out.println(Arrays.toString(arr));
        //
        System.out.println("------------------");
        System.out.printf("[%d",arr[0]);
        for(int i=0; i<arr.length; i++){
            System.out.printf(", %d" ,arr[i]);
        }
        System.out.printf("]\n");
    }
}

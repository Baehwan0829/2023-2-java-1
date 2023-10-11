package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args){
        int[] code = {-4, -1, 3, 6, 11};
        int[] arr = new int[10];
        //
        //
        for(int i=0; i<arr.length; i++) {
            int r = (int)(Math.random() * code.length); // code배열 개수만큼 랜덤함수 변수 r 에 대입
            arr[i] = code[r]; //
        }
        //
        System.out.println(Arrays.toString(arr));
        //
    }
}

package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
    public static void main(String[] args){
        /*
        0~9의 개수를 출력
        0 0 0 1 0 8 2 9
        0의 개수 : 4
        ...
        9의 개수 : 1
        */
        final int LEN = 10; // 바뀔 수 없는 숫자
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        //
        for(int i=0; i<LEN; i++){
            int r = (int)(Math.random() * LEN);
            numArr[i] = r;
        }
        System.out.println(Arrays.toString(numArr)); // 랜덤값 출력
        System.out.println("===========================");
        //
        for(int i=0; i<LEN; i++){
           cntArr[i] = cntArr[numArr[i]]++;
        }
        for (int i=0; i<LEN; i++) {
            System.out.printf("%d의 개수는 : %d\n", i, cntArr[i]);
        }
    }
}

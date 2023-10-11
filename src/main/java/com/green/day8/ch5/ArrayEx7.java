package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        /* 1. 정수 10개를 저장할 수 있는 배열
           2. 0 ~ 9 값을 순차적으로 대입
        */
        int[] num = new int[10];
        //
        for(int i=0; i<num.length; i++){
            num[i] = i;
            System.out.printf("num[%d] : %d\n", i, num[i]);
        }
        System.out.println(Arrays.toString(num));
    }
}

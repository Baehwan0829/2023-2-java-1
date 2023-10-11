package com.green.mynote.month10.java1006;

import java.util.Arrays;

public class Array_3 {
    public static void main(String[] args){
        int i = 0;
        //
        int[] arr = new int[10]; // 열 개의 공간이 있다.
        // 조건식을 만든다
        for( i=0; i<arr.length; i++){
            arr[i] = i; // 0~9 숫자로 초기화
            System.out.printf("arr[%d] : %d\n", i, arr[i]); // 0
            // System.out.println(Arrays.toString(arr));
            // 위의 출력문이 조건문 안에 있을 경우 숫자값이 생성될 때 마다 차례대로 출력
        }
        System.out.println(Arrays.toString(arr));
        //
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        System.out.println("길이가 10인 배열의 값을 0 ~ 9의 숫자로 차례로 최기화하여 출력하는 코드문");
        //
    }
}

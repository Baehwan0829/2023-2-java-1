package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayRandomMissionResult {
    public static void main(String[] args) {
        /*
        5개의 정수형 배열을 만들기
        각 방의 1~10의 랜덤한 값을 넣기
        (중복 숫자제거)
         */
        //
        int[] arr = new int[5];
        //
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
            System.out.println(arr[i]);
            //
            for(int j=0; j<i; j++){ // false
                if(arr[i] == arr[j]){
                    i--;
                    break; // 중복 값이 나왔을 경우 불필요할 일을 안하기 위해서
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

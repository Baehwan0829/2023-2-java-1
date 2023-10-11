package com.green.day8.ch5;

public class ArrayEx2 {
    public static void main(String[] args){
        /*
        5개의 정수형 배열을 만들기
        각 방의 1~10의 랜덤한 값을 넣기
         */
        //
        int[] arr1 = new int[5];
        //
        for(int i=0; i<arr1.length; i++) {
            arr1[i] = (int)(Math.random() * 10)+1; // arr1 배열칸에 1~10까지 랜덤한 숫자를 삽입
        }
        // 분리하는 습관 들이기
        for(int i=0; i< arr1.length; i++) {
            System.out.printf("arr[%d] : %d\n", i,arr1[i]);
        }
    }
}

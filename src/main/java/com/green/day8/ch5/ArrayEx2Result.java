package com.green.day8.ch5;

import java.util.Arrays; // Arrays.toString() 을 사용하기 위해선 추가해야함

public class ArrayEx2Result {
    public static void main(String[] args){
        /*
        5개의 정수형 배열을 만들기
        각 방의 1~10의 랜덤한 값을 넣기
         */
        //
        int[] arr1 = new int[5]; // Magic Number :  의미가 있는 숫자를 부여
        //
        for(int i=0; i<arr1.length; i++) { // 배열의 크기만큼 반복작업
            arr1[i] = (int)(Math.random() * 10)+1; // 입력 / 쓰기
        }
        // 분리하는 습관 들이기
        for(int i=0; i< arr1.length; i++) {
            System.out.printf("arr[%d] : %d\n", i,arr1[i]); // 읽기
        }
        //
        System.out.println(arr1); //  주소값을 문자열로 바꾸어 출력
        System.out.println(arr1.toString()); // toString 자동변환
        System.out.println(Arrays.toString(arr1)); // 배열에 있는 값을 표현
    }
}

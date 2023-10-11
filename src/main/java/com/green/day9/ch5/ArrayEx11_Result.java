package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11_Result {
    public static void main(String[] args){
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        //

        for(int i=0; i<LEN; i++){
            int r = (int)(Math.random() * LEN);
            numArr[i] = r;
            // 위 코드를 간단하게 표기하면 밑에 코드가 된다.
            numArr[i] = (int)(Math.random() * LEN);
        }
        System.out.println(Arrays.toString(numArr)); // 랜덤값 출력
        System.out.println("===========================");
        //
        for (int val : numArr) { // 비교할 값을 오른쪽, 선언해줄 변수를 왼쪽
            cntArr[val]++; // 반복시킬 값을 넣고 배열안에 변수값을 삽입
        }
        //
        System.out.println(Arrays.toString(cntArr));
    }
}

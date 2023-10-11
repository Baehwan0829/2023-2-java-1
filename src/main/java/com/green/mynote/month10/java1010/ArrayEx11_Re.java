package com.green.mynote.month10.java1010;

import java.util.Arrays;

public class ArrayEx11_Re {
    public static void main(String[] args){
        //
        final int LEN = 5; // 바뀔 수 없는 숫자
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        //
        for(int i=0; i<numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 5); // 랜덤값을 final 값보다 크게 잡게되면 출력이 안됨
            System.out.print(numArr[i]);
        }
        System.out.println();
        //
        for(int i=0; i<numArr.length; i++){
            cntArr[numArr[i]]++; // i의 값이 numArr의 값이며, 그 값을 cntArr의 값을 1 증가시킨다.
        }
        for (int i=0; i<numArr.length; i++) {
            System.out.println(cntArr[i]);
        }
    }
}

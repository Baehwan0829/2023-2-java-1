package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayEx7_2 {
    public static void main(String[] args) {
        /* 1. 정수 10개를 저장할 수 있는 배열
           2.  0 ~ 9 값을 순차적으로 대입
           3. 셔플
        */
        int[] num = new int[10];
        //
        for(int i=0; i<num.length; i++){
            num[i] = i;
            System.out.printf("num[%d] : %d\n", i, num[i]);
        }
        // 이게 셔플 코드문
        for (int i=0; i<num.length; i++){
            //
            int r = (int) (Math.random() * num.length); // 랜덤 변수명 생성
            if( i == r) { continue; } // i == r 는 9
            // 이 부분 숙지하기
            int chg = num[i]; //  num[i] 값을 가지고 있을 정수형 변수인 chg 를 생성
            num[i] = num[r]; // num[r]에 만들어진 값을 비워진 num[i]에 삽입
            num[r] = chg; // 정수형 변수가 가지고 있는 chg 값을 num[r]에 삽입
            //
        }
        System.out.println(Arrays.toString(num));
    }
}

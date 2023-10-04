package com.green.day4.ch4;

import java.util.Scanner;

public class If_3Result {
    public static void main(String[] args){
        // val값이 홀수면 > "11은 홀수"
        // val값이 짝수면 > "12는 짝수"
        int val = (int)(Math.random() * 100 ) + 1 ;  // 1 ~ 100
        if ( val % 2 == 0 ) {
            System.out.printf("%d는 %s수입니다.\n", val, val % 2 == 0 ? "홀" : "짝");
        }
        //
    }
}

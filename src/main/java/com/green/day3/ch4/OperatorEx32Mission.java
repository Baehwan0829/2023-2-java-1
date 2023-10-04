package com.green.day3.ch4;

import java.util.Scanner;

public class OperatorEx32Mission {
    public static void main(String[] args){
        /*
            절대값 만들기
            if : n이 -10였다면 콘솔에 10이 출력
            if : n이 9이었다면 콘솔에 9가 출력
            n = n  -1;
            n = -n;
        */
        int n = -89;
        if (n < 0){
            System.out.println(-n);
        }
        else {
            System.out.println(n);
        }
    }
}

package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2Result {
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        System.out.print(" 숫자를 하나 입력하세요 ");
        int num = scan.nextInt();
        if (num == 0) {
            System.out.println("다른 값을 입력해주세요");
        }
        else {
            if (num % 2 == 0) {
                System.out.printf("%d는 짝수입니다", num);
            } else {
                System.out.printf("%d는 홀수입니다", num);
            }
        }
        //
        /*
        if ( num % 2 == 1 ) {
            System.out.printf("입력하신 %d는 홀수 입니다.\n", num);
        }
        else {
            System.out.printf("입력하신 %d는 짝수 입니다.\n", num);
        }
         */
    }
}

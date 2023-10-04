package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2_2 {
    public static void main(String[] args) {
        /*
         ( 콘솔 ) 숫자를 하나 입력하세요
         입력을 기다리기
         숫자가 입력하고 Enter를 누르면
         string 변수에 해당값이 저장될 수 있도록
         해당값이 홀수입니다.
         00은 짝수입니다.

         예) 입력을 8로 했다
         입력을 17로 했다
         17은 홀수 입니다.
        */
        Scanner scan = new Scanner(System.in);
        System.out.print(" 숫자를 하나 입력하세요 ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        System.out.printf("입력하신 숫자는 %d 입니다.\n", num);
        //
        if ( num % 2 == 1 ) {
            System.out.printf("입력하신 %d는 홀수 입니다.\n", num);
        }
        else {
            System.out.printf("입력하신 %d는 짝수 입니다.\n", num);
        }
    }
}

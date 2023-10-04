package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx10 {
    public static void main(String[] args){
        /*
            스위치 사용
            90점이상 A학점
            80점이상 B학점
            70점이상 C학점
            나머지는 D학점
         */
        int score = 0;
        char grade = 'F';

        Scanner s = new Scanner(System.in);
        System.out.print("당신의 점수를 입력하세요 : ");
        String temp = s.nextLine();
        score = Integer.parseInt(temp);
        //
        // int num = score / 10;
        switch (score / 10){
            case 9,10 :
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            default:
                System.out.printf("F학점");
        }
    }
}


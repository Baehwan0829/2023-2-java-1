package com.green.mynote.java1004;

import java.util.Scanner;

public class FlowEX28Re {
    public static void main(String[] main){
        /*
        do while문 사용
         */
        int input = 0;
        int answer = (int)(Math.random() * 100) + 1; //
        Scanner s = new Scanner(System.in);
        //
        do {
            System.out.print("1~100까지의 숫자를 입력 : ");
            input = s.nextInt();

            if (input < answer) {
                System.out.println("up");
            }
            else if (input > answer) {
                System.out.println("down");
            }
        }
        while (input != answer );
        System.out.println("good");
        // break이 필요없다.
    }
}

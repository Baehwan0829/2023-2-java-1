package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28_2 {

    public static void main(String[] args) {
        int input = 0;
        int answer = (int)(Math.random() * 100) + 1; // 1 ~ 100
        //
        Scanner s = new Scanner(System.in);
        //
        while (true){
            System.out.print("1~100사이의 숫자를 입력 : ");
            input = s.nextInt(); // null.nextInt는 메소드이다.
            if (input ==  answer) { break; }
            System.out.println(input < answer ? "up" : "down");
            //
            /*
            if (input < answer){
                System.out.println("UP");
            }
            else if (input > answer) {
                System.out.println("DOWN");
            }
            else{
                System.out.println("answer = " + answer + " GOOD");
                break;
            */
        }
    }
}

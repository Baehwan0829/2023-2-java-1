package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        int sum = 0;
        int input = 0;
        //
        Scanner s = new Scanner(System.in);
        //
        while(true){ // boolean type
            System.out.print("1~100사이의 숫자 입력 : ");
            input = s.nextInt();
            if(input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println("End " + sum);
    }
}

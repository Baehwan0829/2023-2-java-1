package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx2Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자 하나 입력");
        String str = scanner.nextLine();
        int val = Integer.parseInt(str);
        //
        if( val == 0 ){
            System.out.println("입력된 숫자는 0 입니다");
        }
        if( val != 0 ){
            System.out.println("입력된 숫자는 0이 아닙니다.");
            System.out.println("입력하신 숫자는 " + val + " 입니다");
        }
        /*
        else {
            System.out.println("입력된 숫자는 0이 아닙니다");
            System.out.println("입력하신 숫자는 " + val + " 입니다");
        }
        */
    }
}

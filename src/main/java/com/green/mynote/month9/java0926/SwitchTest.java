package com.green.mynote.month9.java0926;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args){
        /*
          주민번호가 앞자리가
          99로 시작하면 20세기표시
          00으로 시작하면 21세기표시
        */
        Scanner s = new Scanner(System.in);
        System.out.print("주민번호 앞자리를 입력하세요 :");
        String humanID = s.nextLine();
        char year = humanID.charAt(0);
        System.out.println();
        //
        switch (year){
            case '0':
                System.out.println("21세기");
                break;
            case '9':
                System.out.println("20세기");
                break;
        }
    }
}

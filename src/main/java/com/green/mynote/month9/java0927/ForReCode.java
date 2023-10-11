package com.green.mynote.month9.java0927;

import java.util.Scanner;

public class ForReCode {
    public static void main(String[] args){
        /*
        이 짓은 하지말자
        for을 1회 사용코드
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" * 를 출력할 수를 입력하세요 : ");
        int line =  s.nextInt();
        //
        System.out.println("-----------------------------");
        int wun = 1;
        int zen = 1;
        //
        for(int i=1; i <= line * line; i++){
            if( wun++ <= zen){
                System.out.print("*");
            }
            else{
                System.out.print("");
            }
            if( i % line == 0){
                zen++;
                wun = 1;
                System.out.println();
            }
        }
    }
}

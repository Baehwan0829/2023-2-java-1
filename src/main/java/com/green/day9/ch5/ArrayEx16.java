package com.green.day9.ch5;

import java.util.Scanner;

public class ArrayEx16 {
    public static void main(String[] args) {
        //
        String[] thr = new String[3];
        Scanner s = new Scanner(System.in);
        //
        for(int i=0; i<thr.length; i++){
            System.out.print("문자를 입력하세요 : ");
            String input = s.nextLine();
            thr[i] = input;
        }
        //
        for(String str : thr){
            System.out.print( str);
        }
    }
}

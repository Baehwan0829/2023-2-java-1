package com.green.mynote.month10.java1006;

import java.util.Scanner;

public class Scanner_Array {
    public static void main(String[] args) {
        //
        Scanner s = new Scanner(System.in);
        //
        System.out.print("배열 길이를 생성 : ");
        int num = s.nextInt();
        int[] zen = new int[num];
        //
        System.out.printf("%d개의 배열이 생성됨\n", num);
        //
        for(int i = 0; i< zen.length; i++){
            System.out.println((i+1) + "번까지 zen이 입력");
            zen[i] = s.nextInt();
        }
        System.out.println("배열의 zen : ");
        for(int i=0; i< zen.length; i++){
            System.out.print(zen[i] +"");
        }
    }
}

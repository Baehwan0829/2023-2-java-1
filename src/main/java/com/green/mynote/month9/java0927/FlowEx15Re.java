package com.green.mynote.month9.java0927;

import java.util.Scanner;

public class FlowEx15Re {
    public static void main(String[] args){
        /*
        Scaneer를 이용하여 알고싶은 구구단을 출력하기
        */
        Scanner s = new Scanner(System.in);
        System.out.print("구구단을 입력하세요 : ");
        int DAN = s.nextInt();
        //
        for(int i=1; i<=9; i++){
                System.out.printf("%d x %s = %s\n", DAN, i, DAN*i);
        }
        System.out.println();
    }
}

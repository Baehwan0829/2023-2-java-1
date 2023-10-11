package com.green.mynote.month10.java1005;

import java.util.Scanner;

public class Me {
    public static void main(String[] args){
        //
        Scanner s = new Scanner(System.in);
        System.out.print("마음에 드는 숫자를 입력하세요 : ");
        int num = s.nextInt();
        //
        if( num == 0){
            System.out.println("욕심이 없으시네요");
        }
        else if (num <= 50){
            System.out.println("소박한 하시네요");
        }
        else{
            System.out.println("의외로 욕심이 있으시군요");
        }
    }
}

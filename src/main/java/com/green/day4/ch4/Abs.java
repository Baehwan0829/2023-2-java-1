package com.green.day4.ch4;

import java.util.Scanner;

public class Abs {
    public static void main(String[] args){
        // 10는(은) 절댓값 10
        // -9는(은) 절댓값 9
        // -6는(은) 절댓값 6
        //
        Scanner s =  new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = s.nextInt();
        //
        if ( num < 0 ){ // 움수
            System.out.printf("%d는 절댓값 %d\n", num, -num);
        }
        else { // 양수
            System.out.printf("%d는 절댓값 %d\n", num, num);
        }
        //
        System.out.println("==============================");
        //
        System.out.printf("%d는 절댓값 %d\n", num, num < 0 ? -num : num);
    }
}


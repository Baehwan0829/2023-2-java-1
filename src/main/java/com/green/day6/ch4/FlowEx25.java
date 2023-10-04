package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args){
        int num = 0, sum = 0;
        System.out.print("숫자를 입력해주세요 : ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        //
        while (num != 0 ){
            sum += num % 10; // sum = sum + num % 10;
            /*
            int modVal = num % 10;
            sum = sum + modVal;

            num = num / 10;
            */
            num /= 10;
        }
        System.out.println("결과 : " + sum);
    }
}

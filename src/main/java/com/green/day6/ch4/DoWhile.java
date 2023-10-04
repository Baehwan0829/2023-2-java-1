package com.green.day6.ch4;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int input = 0;
        //
        do{ // 한 번은 무조건 실행 및 체크한다.
            System.out.print("1~100까지 숫자 입력 :");
            input = s.nextInt();
            sum += input;
        }
        while (input != 0); // 들어가기 전에 한 번 실행한다.
        System.out.println("End " + sum);
    }
}

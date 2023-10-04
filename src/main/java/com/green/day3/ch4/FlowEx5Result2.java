package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result2 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        //
        String grade = "C";
        String opt = "";
        //
        if (score >= 90) { // A
            grade = "A";
        }
        else if (score >= 80) { // B
            grade = "B";
        }
        //
        if (score >= 80) {
            int rMod = score % 10; // score에 입력된 값에 10을 나눴을 때 나머지 값을 rMod에 입력
            if (rMod >= 8 || score == 100) {
                opt = "+";
            }
            else if (rMod <= 3) {
                opt = "-";
            }
        }
        System.out.printf("%s%s 학점", grade, opt);
    }
}

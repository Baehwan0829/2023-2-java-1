package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Result {
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
            if (score >= 98) {
                opt = "+";
            } else if (score <= 93) {
                opt = "-";
            }
        } else if (score >= 80) { // B
            grade = "B";
            if (score >= 88) {
                opt = "+";
            } else if (score <= 83) {
                opt = "-";
            }
        }
        else {
            System.out.printf("%s%s 학점", grade, opt);
        }
    }
}

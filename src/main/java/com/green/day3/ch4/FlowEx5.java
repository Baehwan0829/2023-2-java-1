package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5 {
    public static void main(String[] args) {
        int score = 0;
        System.out.print("점수를 입력하세요 :");
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();
        //
        if (score >= 90) { // A
            if (score >= 98) {
                System.out.printf("A+");
            }
            else if (score <= 93) {
                System.out.printf("A-");
            }
            else {
                System.out.printf("A");
            }
        } else if (score >= 80) { // B
            if (score >= 89) {
                System.out.printf("B+");
            }
            else if (score <= 84) {
                System.out.printf("B-");
            }
            else {
                System.out.printf("B");
            }
        }
        else { // C
            System.out.println("C");
        }
    }
}

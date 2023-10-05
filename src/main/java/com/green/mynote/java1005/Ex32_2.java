package com.green.mynote.java1005;

import java.util.Scanner;

public class Ex32_2 {
    public static void main(String[] args) {
        int input = 0;
        Scanner s = new Scanner(System.in);
        //
        System.out.print("메뉴를 선택하세요 : ");
        input = s.nextInt();
            System.out.println("---------------------------------");
            System.out.println("switch문");
            switch (input) {
                case 0:
                    break;
                case 1, 2, 3:
                    System.out.printf("선택하신 메뉴는 %d번입니다.\n", input);
                case 4:
                    System.out.println("잘못 선택하신 메뉴입니다.");
            }
    }
}
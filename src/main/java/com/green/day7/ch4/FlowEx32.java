package com.green.day7.ch4;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //
        while (true) {
            System.out.print("메뉴를 선택하세요 : ");
            int input = s.nextInt();
            if (input == 0){
                break;
            }
            else if ( !(1 <= input && input >= 3)) {
                System.out.printf("선택하신 메뉴는 %d번입니다.\n", input);
            }
            else {
                System.out.println("잘못 선택하신 메뉴입니다.");
            }
        }
    }
}
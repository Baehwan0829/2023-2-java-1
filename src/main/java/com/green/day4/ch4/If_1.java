package com.green.day4.ch4;

import java.util.Scanner;

public class If_1 {
    public static void main(String[] args) {
        /*
         scanner를 이용하여 성별을 입력
         만약에 남자 입력되었다면 콘솔에 잘생겼다 출력
         여자일 경우 이쁘다가 출력
         아닐경우 누구냐 출력
         */
        //
        Scanner s = new Scanner(System.in);
        System.out.print("성별을 입력해주세요 : ");
        String gender = s.nextLine();
        //
        if(("남자").equals(gender)){
            System.out.printf("잘 생겼다\n");
        }
        else if(("여자").equals(gender)){
            System.out.printf("예쁘다\n");
        }
        else {
            System.out.printf("누구냐\n");
        }
        System.out.println("===========================");
    }
}

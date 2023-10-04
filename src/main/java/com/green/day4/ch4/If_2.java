package com.green.day4.ch4;

import java.util.Scanner;

public class If_2 {
    public static void main(String[] args) {
        /*
         scanner를 이용하여 성별을 입력 ( 남자 ,남, man Man, 여자, 여, waman, Waman)
         만약에 남자 입력되었다면 콘솔에 잘생겼다 출력
         여자일 경우 이쁘다가 출력
         아닐경우 누구냐 출력
         */
        //
        Scanner scanner = new Scanner(System.in);
        System.out.print("성별을 입력해주세요 : ");
        String gender = scanner.nextLine();
        //
        String msg = "누구세요";
        //
        // || : OR 연산자 논리식 중 하나라도 참이면 true
        // && : AND 연산자 논리식 중 모두 참이면 true
        if("남자".equals(gender) || "남".equals(gender) || "man".equals(gender) || "Man".equals(gender)){
            msg = ("잘생겼다.");
        }
        else if("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)){
            msg = ("예쁘다.");
        }
            System.out.println(msg);
    }
}

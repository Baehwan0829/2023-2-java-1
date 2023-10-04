package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args){
        /*
            주민번호를 입력받으시고
            주민번호를 확인하시고 > 남자인지 여자인지 , 유효하지않은 주민등록번호인지 출력
        */
        System.out.print("당신의 주민번호를 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        String humanID = s.nextLine();
        char gender = humanID.charAt(7);
        //
        switch (gender){ // 정수, 문자열, char는 사용이 가능하면, 실수형, boolean은 안된다.
            case '1','3':
                System.out.println("남성입니다.");
                break;
            case '2','4':
                System.out.println("여성입니다.");
                break;
            default:
                System.out.println("유효하지 않습니다.");
                break;
        }
    }
}

package com.green.day4.ch4;

import java.util.Scanner;

public class FlowEx6 {
    public static void main(String[] args){
        /*
            mon값이 3~5월 사이면 봄
                   6~8월 사이면 여름
                   9~11월 사이면 가을
                   12~2월 사이면 겨울
        */
        System.out.print("현재 월을 입력하세요 : ");
        Scanner s = new Scanner(System.in);
        int mon = s.nextInt();
        //
        // switch문은 문자열 가독성이 좋다.
        switch (mon){
            case 12, 1, 2:
                System.out.println("현재의 계절은 겨울입니다.");
                break;
            case 3, 4, 5:
                System.out.println("현재의 계절은 봄입니다.");
                break;
            case 6, 7, 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9, 10, 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default:
                System.out.println("그러한 월은 없습니다.");
        }
    }
}

package com.green.mynote.java1005;

import java.util.Scanner;

// go / stop : go
// 현재등급 : 2
// go / stop : go
// 현재등급 : 1
// go / stop : go
// 현재등급 : 0
// go / stop : go
// 현재등급 : -1
// 실패
// 스캐너를 사용하여 go 일 때 저장해줍니다.
public class RandomPlus {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int enhance = 1;
        System.out.printf("강화단계 : %d\n go / stop : \n",enhance);
        String level = s.nextLine();
        int min = 0, max = 22;
        int rd = (int)(Math.random()*(max-1))+min;
        //
        Loop1 : while (0 <= enhance && enhance <= 22){
            if (level) {
                if (("go").equals(rd)) {
                    System.out.printf("지금 강화단계: %d\n", (rd > 2) ? ++enhance : --enhance);
                }
                else if (0 <= enhance && enhance <= 22) {
                    System.out.println("Go/Stop : ");
                    level = s.nextLine();
                }
                else {
                    break Loop1;
                }
            }
        }
    }
}

package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args){
        /*
        스캐너 이용 점수입력
        *를 출력할 라인의 수를 입력
         */
        Scanner s = new Scanner(System.in);
        System.out.print(" * 를 출력할 수를 입력하세요 : ");
        int star =  s.nextInt();
        // for 중첩문 코드
        for(int i=1; i <= star; i++){
            for(int z=0; z < i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");
        //
        for(int i=0; i < star; i++){
            for(int z=0; z <= i; z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

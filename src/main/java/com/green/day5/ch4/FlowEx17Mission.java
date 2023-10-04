package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx17Mission {
    public static void main(String[] main){
        Scanner s = new Scanner(System.in);
        System.out.print("*를 출력하실 수를 입력 : ");
        int line = s.nextInt();
        //
        for(int i=1; i <= line; i++){
            for(int j=line-i; j >0; j--){
                System.out.printf("-");
            }
            for(int j=0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        // if문 사용
        System.out.println("--------------");
        for(int i=line; i>0; i++){
            for(int z=1; z<=line; z++){
                if(z < i){
                    System.out.print("_");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        // 삼항식 사용
        System.out.println("--------------");
        for(int i=line; i>0; i++){
            for(int z=1; z<=line; z++){
                System.out.print( z < i ? "_" : "*");
            }
            System.out.println();
        }
    }
}

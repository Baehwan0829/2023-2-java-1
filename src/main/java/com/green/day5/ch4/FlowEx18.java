package com.green.day5.ch4;

public class FlowEx18 {
    public static void main(String[] args){
        /*
         2~9단 구구단 만들기
         */
        System.out.println(".......");
        for(int i=2; i <= 9; i++) { // 2~9단
            for(int z=1; z <= 9; z++) { // 1~9
                System.out.printf("%s * %s = %s\n", i, z, i*z );
            }
            System.out.println(".......");
        }
    }
}

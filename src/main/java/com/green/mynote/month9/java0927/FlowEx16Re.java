package com.green.mynote.month9.java0927;

public class FlowEx16Re {
    public static void main(String[] args){
        /*
         중첩 반복문 사용
         가로 20개, 세로 7줄
         별을 찍기
         */
        System.out.println("--------------------");
        for(int i=0; i<7; i++){
            for(int z=0; z<20; z++){
                System.out.print("/");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }
}

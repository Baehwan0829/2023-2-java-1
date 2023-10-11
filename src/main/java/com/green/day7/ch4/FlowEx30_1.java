package com.green.day7.ch4;

public class FlowEx30_1 {
    public static void main(String[] args) {
        /*
        반복문 사용
        i값이 계속 증가가되면 sum에 중첩으로 더하기
        sum값이 100초과가되는 시점의 i값
         */
       int sum = 0;
       int i = 0;
       final int TRG = 100; // Magic Number
        //
        while (true){
            sum += ++i;
            if(sum > TRG) {
                break;
            }
        }
        System.out.printf("sum : %d + %d\n", sum, i);
        System.out.println("100초과된 i값 = " + i);
        System.out.println("--------");
        //
        while (sum < TRG){
            sum += ++i;
        }
        System.out.printf("sum : %d + %d\n", sum, i);
        System.out.println("100초과된 i값 = " + i);
    }
}

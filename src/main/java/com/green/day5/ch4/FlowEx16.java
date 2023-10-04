package com.green.day5.ch4;

public class FlowEx16 {
    public static void main(String[] args){
        /*
         중첩 반복문 사용
         가로 10개, 세로 5줄
         별을 찍기
         */
        System.out.println("------------------------");
        for(int i=0; i<5; i++){ // 세로
           for(int z=0; z<10; z++) { // 가로
               System.out.print("*");
           }
            System.out.println();
        }
        System.out.println("------------------------");
        // 중접 반복문을 한 줄로 요약할 경우
        for(int i=1; i<=10*5; i++) {
             System.out.print("*");
             if( i % 10 == 0 ) {
                System.out.println();
             }
        }
    }
}

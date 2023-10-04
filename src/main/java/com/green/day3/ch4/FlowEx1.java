package com.green.day3.ch4;

public class FlowEx1 {
    public static void main(String[] args){
        int x = 0; // 변수선언과 초기화
        System.out.printf("X=%d일 때, 참인 것은\n", x);
        if ( x == 0 ) { // 출력문 몇개여도 상관없다. boolean Type , 비교 연산자
            System.out.println(" x == 0 ");
        }
        if ( x != 0 ) {
            System.out.println(" x != 0 ");
        }
        System.out.println("--------------");
        //
        x = 1;
        System.out.printf("X=%d일 때, 참인 것은\n", x);
        if ( x == 0 ) { // 출력문 몇개여도 상관없다.
            System.out.println(" x == 0 ");
        }
        if ( x != 0 ) {
            System.out.println(" x != 0 ");
        }
        //
        if ( !( x == 0 ) ) { // 출력문 몇개여도 상관없다.
            System.out.println(" !( x == 0 ) ");
        }
        if ( !( x != 0 ) ) {
            System.out.println(" !( x != 0 ) ");
        }
        //
        System.out.println("End!");
    }
}

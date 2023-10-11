package com.green.day10.ch6;

public class NumberBox {
    // 리턴타입 , 메소드 명 , 매게변수
    // int = 0;
    // void method
    //
    void sum(int n1, int n2){
        // 매게변수에 type이 같더라도 일일히 작성, 호출 때 마다 초기화
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }
    //
    void minus(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, (n1 - n2));
    }
    //
    void abs(int n1){
        System.out.println(n1 > 0 ? n1 : -n1); // 절댓값
    }
}

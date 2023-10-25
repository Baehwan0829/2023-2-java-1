package com.green.mynote.month10.java1011;

public class MethodExtry {
    //
    // Class 자체의 공간 ( 설계도, 도면 )
    // 속성과 기능( method )를 작업하는 공간
    //
    // 속성 : Member field ( 전역 변수 ), instance variable
    // method : Member Method ( 지역 변수 ), local variable
    //
    // return method
    int methodExInt(int n1, int n2){
        return n1 + n2;
    }
    //
    // 메소드 :
    // void(리턴타입) a(메소드명) ()(파라미터-매개변수)
    //    void         sum     ()     메소드를 정의했다
    //
    //       [ 선 언 부]       [ 구 현 부 ]
    //        void a()      { 구현할 코드문 }
    //
    // void method
    void sum (int n1, int n2){
        System.out.printf("sum : %d\n" , (n1 + n2));
    }
}

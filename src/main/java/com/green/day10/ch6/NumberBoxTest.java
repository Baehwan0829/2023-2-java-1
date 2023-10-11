package com.green.day10.ch6;

public class NumberBoxTest {
    public static void main(String[] args){
        // NumberBox nb1 = new NumberBox();
        // new class(); : 객체생성, 생성자호출
        // 대문자로 시작하니 변수선언, 래퍼런스 변수는 주소값을 담을 수 있다.
        // 호출
        //
        NumberBox nb1 = new NumberBox();
        // void method
        nb1.sum(10, 20);
        nb1.sum(30, 40);
        //
        nb1.minus(30, 20);
        //
        nb1.abs(-10);
        nb1.abs(33);
    }
}

package com.green.day13.ch6;

public class OverloadingTest {
    //
    public static void main(String[] args) {
        System.out.println();
    }
    //
    // 같은 클래스 내의 이미 사용한 메소드명과 같은 메소드명이 있더라도 사용이 가능하다.
    //
    // OverLoading 중요점
    // 매개변수 타입의 갯수, 위치
    // 리턴타입은 상관없다.
    //
    void print(){}
    void print(int n){}
    void print(int n, int m){}
    //
    void print(int n1, String str2){}
}

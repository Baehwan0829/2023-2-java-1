package com.green.day10.ch6;

public class Tv {
    //
    // 속성
    // Member field : 멤버필듯
    String color;
    boolean power;
    int channel;
    //
    // 메소드
    // Member Method : 멤버멤소드
    // return Type , : void
    // 메소드명 ,     : sum
    // 매게변수 ( 파라미터 ) <- 이 3개가 중요하다.
    //
    // 메소드 정의 : defined
    //
    void Power() { power = !power; }
    void channelUp() { channel++; }
    void channelDawn() { channel--; }
    /*
    void channelDawn() : 선언부
    { channel--; } : 구현부 ( implement )
    //
    tv1.channelUp(); : 선언부
    // CallBack :
    // defined
     */
}

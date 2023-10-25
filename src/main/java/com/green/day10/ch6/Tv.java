package com.green.day10.ch6;

public class Tv {
    //
    // 속성 Member field : 멤버필드
    //
    String color;
    boolean power;
    int channel;
    //
    // return Type , : void
    // 메소드명 ,     :
    // 매게변수 ( 파라미터 ) <- 이 3개가 중요하다.
    //
    // void(리턴타입) a(메소드명) ()(파라미터-매개변수)
    //    void        power    ()   - 메소드를 정의했다
    //
    // 메소드 Member Method : 멤버메소드
    void Power() { power = !power; }
    void channelUp() { channel++; }
    void channelDawn() { channel--; }
    /*
        [ 선 언 부]       [ 구 현 부 ]
    void channelDawn() { channel--; }
    //
    CallBack
     */
}

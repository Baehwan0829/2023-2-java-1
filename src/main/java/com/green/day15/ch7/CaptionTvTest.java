package com.green.day15.ch7;

//
class Tv{
    boolean power; // 속성
    int channel;
    //
    void power() { power = !power; } // togol , Method
    void channelUP() { channel++; }
    void channelDown() { channel--; }
}
//
class CaptionTv extends Tv{
    //
    boolean caption; // 전역변수
    //
    void displayCaption(String text){ // 메소드
        if(caption){
            System.out.println(text);
        }
    }
    //
    @Override // 애노테이션 Annotation
    void channelUP(){
        channel += 5;
    }

    // 오버라이딩 : 부모 클래스내의 메소드 구현부를
    // 받지 않고
    // 자식 클래스내 메소드 구현부를 새롭게 정의하여 쓰겠다.
    // 단, 메소드명과 파라미터는 같아야한다.
    //
}
//
public class CaptionTvTest {
    //
    public static void main(String[] args) {
        //
        CaptionTv cTv = new CaptionTv();
        System.out.printf("1. cTv.power : %b\n", cTv.power);
        //
        cTv.channel = 10; // ()가 없으면 멤버필드
        cTv.channelUP();
        System.out.printf("2. cTv.channel : %d\n", cTv.channel); // 12
        cTv.channelDown();
        System.out.printf("3. cTv.channel : %d\n", cTv.channel); // 11
        //
        //
        cTv.displayCaption("Hello");
        //
    }
}

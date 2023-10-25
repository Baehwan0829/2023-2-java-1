package com.green.day15.ch7;
//
class Tv2{
    boolean power;
    int channel;
    //
    void power() { power = !power; }
    void channelUP() { channel++; }
    void channelDown() { channel--; }
}
//
class CaptionTv2 extends Tv2{

    // int channel;
    boolean caption;
    void displayCaption(String text){
        if(caption){
            System.out.println(text);
        }
    }
    //
    /*
        CaptionTv2에 int channel이 있을 경우
        this.channel은 있으니 부모 객체에 있는 int channel에 저장된 값을 불러오지 않는다. // 10
        super.channel은 부모 객체에 있는 channel에 저장된 값을 불러온다. // 1
        channel은 자신의 매개변수 값을 불러온다. // 10
        this.channel = channel랑 값은 같다.
        //
        CaptionTv2에 int channel이 없을 경우
        this.channel은 없기에 부모 객체에 있는 int channel에 저장된 값을 불러온다. // 11
        super.channel은 부모 객체에 있는 channel에 저장된 값을 불러온다. // 11
        channel은 자신의 매개변수 값을 불러온다. // 11
        this.channel = super.channel = channel 값은 다 같다.
    */
    //
    void printgetParentChannel(){
        System.out.printf("parent - channel : %d\n", channel);
        // this.channel : 10
        // channel : 10
        //
    }
}
//
public class CaptionTvTest2 {
    public static void main(String[] args) {
        //
        CaptionTv2 ctv = new CaptionTv2();
        ctv.channel = 10;
        ctv.channelUP();
        System.out.printf("ctv.channel : %d\n", ctv.channel);
        ctv.printgetParentChannel();
        // 부모, 자식 클래스 둘다 channel이 있고
        // 가까운 자식 클래스에 있는 channel에 저장
        // channelUP 하면 자식에 channelUP()이 없기에 부모의 channel을 ++ 시킨다

    }
}

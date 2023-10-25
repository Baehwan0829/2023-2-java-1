package com.green.day10.ch6;

public class Tvtest2 {
    public static void main(String[] args) {
        //
        Tv tv1 = new Tv();
        //
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        //
        tv1.channel++;
        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channelUp : %d\n", tv1.channel);
        //

    }
}

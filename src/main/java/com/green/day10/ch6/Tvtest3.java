package com.green.day10.ch6;

public class Tvtest3 {
    public static void main(String[] args) {
        //
        Tv tv1 = new Tv();

        Tv tv2 = tv1;
        System.out.printf("tv1.channel : %d\n", tv1.channel);
        //
        tv1.channelUp();
        tv1.channelUp();
        System.out.printf("tv1.channelUp : %d\n", tv1.channel);
        System.out.printf("tv2.channelUp : %d\n", tv2.channel);
        //

    }
}

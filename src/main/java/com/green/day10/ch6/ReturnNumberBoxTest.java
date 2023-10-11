package com.green.day10.ch6;

public class ReturnNumberBoxTest {
    public static void main(String[] args){
        //
        // instance = new class(); : 객체생성
        // 메소드의 주소값 : r1
        /*
      2.new메소드주소값의 변수 = 1. 메소드의 주소값 new생성
         */
        ReturnNumberBox rn = new ReturnNumberBox();
        //
        int r1 = rn.sum(10,20);
        System.out.println("r1 : " + r1);
        //
        int r2 = rn.sum(30,40);
        System.out.println("r2 : " + r2);
        System.out.println("--끝--");
        //
        int r3 =  rn.abs(-10);
        System.out.println("r3 : " + r3);
        System.out.println("r4 : " + rn.abs(-90));
        System.out.println("r5 : " + rn.abs(-190));
        System.out.println("r6 : " + rn.abs(190));
    }
}

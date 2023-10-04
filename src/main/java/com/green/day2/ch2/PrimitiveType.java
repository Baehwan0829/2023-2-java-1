package com.green.day2.ch2;

public class PrimitiveType {
    public static void main(String[] args){
        // 논리형 boolean
        boolean test = true, test2 = false; // 변수선언을 하지 않고 비교연산자 참,거짓

        // 문자형 char
        char ch = 'a' , ch2 = 'b'; // 거의 사용하지 않는다

        /* 정수형 int byte short long : -128 ~ 127, 0도 정수에 포함
        1bit
        8bit = 1byte
        1024bit = 1KB
        1024KB = 1MB
        1024MB = 1GB
        1024GB = 1TB
        1TB = ??

        64bit ( 8byte )
         */
        byte b1 = 1;    // 1byte
        short s1 = 10;  // 2byte
        int i1 = 100;   // 4byte , CPU가 처리하는 속도가 빠르다.
        int i2 = (int)100L; // 정수형에 리터럴은 long정수만 있다.
        long l1 = 1000; // 8byte

        // 실수형 floot double
        // float f1 = 10.1;
        // float = 4byte
        // double = 8byte
        float f2 = 10.1f, f3 = 10.1F;
        float f4 = (float) 10.1; // 강제 형 변환
        double d1 = 10.1, d2 = 10.1d, d3 = 10.1D;

        float f5 = (float)d1;
    }
}

package com.green.day1;

public class ValEx2 {
    public static void main(String[] args){
        int x = 10 , y = 20;
        int z = x;
        x = y;
        y = z;

        System.out.println("x :  " + x);
        System.out.println("y :  " + y);
        //자동 형 변환, 강제 형 변환
        //두 개의 값을 구할려고 할 때 형 변환
    }
}

package com.green.day2.ch2;

public class CastingEx1 { // Casting : 형 변환
    public static void main(String[] args){
        double d = 85.4;
        int score = (int)d; // 저장이 안되는 이유 Type이 안 맞아서
        System.out.println("score : " + score);
        System.out.println("d : " + d);

        byte b1 = 127;
        short s1 = b1; // 자동 형 변환
        int i1 = s1;

        float f1 = i1; // float가 넓은 범위를 포용하나 정확한 값을 출력이 힘들다.
        int i2 = (int)f1;
    }
}

package com.green.day2.ch2;

public class Mission1 {
    public static void main(String[] args) {
        int n1 = 10, n2 = 3;
        float f1 = (float) n1 / n2;
        // double d1 = (double) n1 / n2; 가능하au, double이 정확도 높다.
        // float f4 = (float) 10.1; // 강제 형 변환
        System.out.println( "답 : " + f1 );

        /*
        double r = n1 / n2; : 자동 형 변환
        double r = (dobule) n1 / n2; : 강제 형 변환
        */
    }
}

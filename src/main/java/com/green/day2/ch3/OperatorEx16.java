package com.green.day2.ch3;

public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f; // 실수
        System.out.println("pi : " + pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 : " + pro1);

        float pro2 = pro1 / 1000f;
        System.out.println("pro2 : " + pro2);

        System.out.println("one : " + (int)(pi * 1000) * 0.001f);
    }
}

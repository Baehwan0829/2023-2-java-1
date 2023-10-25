package com.green.day13.ch6;

public class VarArgEx {
    //
    // 가변인자
    public static void sum(int...n){
        int sum = 0;
        for(int a : n) {
            sum += a;
        }
        System.out.printf("sum   : %d\n", sum);
    }
    //
    public static void main(String[] args) {
        sum(10, 20);
        sum(10, 20, 30);
        sum(10, 20, 30, 40);
    }
}

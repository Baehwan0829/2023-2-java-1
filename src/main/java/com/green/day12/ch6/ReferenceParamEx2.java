package com.green.day12.ch6;

public class ReferenceParamEx2 {
    public static void main(String[] args) {
        int[] x = { 10 };
        System.out.println("1 : " + x[0]);
        //
        change(x);
        System.out.println("2 : " + x[0]);
    }
    static void change(int[] x){
        x[0] = 1000;
        System.out.println("3 : " + x[0]);
    }
}

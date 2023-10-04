package com.green.day4.ch4;

public class RandomVal {
    public static void main(String[] args) {
        double doubleval = Math.random(); // 0.000 ~ 0.9999
        System.out.println("val : " + doubleval);
        //
        int intval = (int)(doubleval * 10);
        // 곱하는 값이 50일 경우 곱하는 값보다 낮다 Ex) 0 ~ 49
        //  doubleval * 10에 ( )를 치는 이유 double이 int형으로 바뀌어 0으로만 존재
        System.out.println("val : " + intval);
        //
        int rVal = (int)(Math.random() * 20);
        System.out.println("rVal : " + rVal);
    }
}

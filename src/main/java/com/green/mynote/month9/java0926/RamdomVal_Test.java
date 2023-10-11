package com.green.mynote.month9.java0926;

public class RamdomVal_Test {
    public static void main(String[] args) {
        /*
            20 ~ 350 사이의 랜덤 값
            180 이하면 그 값의 * 2한 결과값
            180 초과면 그 값의 + 20한 결과값
        */
        int val = (int)(Math.random() * 331) + 20;
        int result = 0;
        //
        if (val <= 180){
            result = val * 2;
        }
        else {
            result = val + 20;
        }
        System.out.println("val : " + val);
        System.out.println(result);
    }
}

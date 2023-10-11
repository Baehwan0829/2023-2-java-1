package com.green.day8.ch5;

public class ArrayEx5 {
    public static void main(String[] args) {
        int[] score ={100,88,100,100,90};
        //
        int sum = 0;
        float ave = score.length;
        //
        for(int i=0; i<score.length; i++){
            sum += score[i];
            // ave = sum / (float) score.length;
        }
        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %.1f\n", sum/ave);
        //
        // System.out.printf("평균 : %.1f\n", sum/score.length);
    }
}

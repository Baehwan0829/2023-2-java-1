package com.green.day9.ch5;

public class ArrayEx18_Result {
    public static void main(String[] args) {
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
        };
        //
        int sum = 0;
        for(int i=0; i<score.length; i++){
            int[] arr = score[i]; // score[i]의 값을 정수형 arr배열에 대입
            for(int j=0; j<arr.length; j++){
                int val = score[i][j]; // score[i][j]의 값을 정수형 val에 값을 대입
                System.out.printf("score[%d][%d] = %d\n", i, j, val);
            }
        }
        //
        System.out.println("===================");
        for(int[] arr : score){ // foreach , 향상된 for문
            for(int siq : arr){
                sum += siq;
            }
        }
        //
        System.out.println("sum : " + sum);
    }
}

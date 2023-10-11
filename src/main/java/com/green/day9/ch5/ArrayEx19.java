package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        //
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
                {51, 52, 53}
        };
        //
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("-------------------------------------");
        //
        int kortotal=0, engtotal=0, mattotal=0;
        int sum = 0;
        float avg = 0f;
        for(int i=0; i<score.length; i++){
            System.out.printf("%d\t",i+1);
            //
            kortotal += score[i][0];
            engtotal += score[i][1];
            mattotal += score[i][2];
            //
            for(int j=0; j< score[i].length; j++){
                System.out.printf("%3d\t", score[i][j]);
                sum += score[i][j];
            }
            System.out.printf("%d", sum);
            avg = (float) sum / score[i].length;
            sum = 0;
            System.out.printf("\t%4.1f",avg);
            System.out.println();
        }
        System.out.println("-------------------------------------");
        System.out.printf("총점: %3d%4d%4d ", kortotal, engtotal, mattotal);
    }
}

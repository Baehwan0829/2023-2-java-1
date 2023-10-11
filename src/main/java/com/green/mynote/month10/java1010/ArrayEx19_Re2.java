package com.green.mynote.month10.java1010;

public class ArrayEx19_Re2 {
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
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("--------------------------");
        int kor = 0, eng = 0, mat = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; i < score.length; i++) {
                kor += score[i][j];
                eng += score[i][j + 1];
                mat += score[i][j + 2];
                 System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\n",
                        i + 1, score[i][j],
                        score[i][j + 1],
                        score[i][j + 2],
                        score[i][j] + score[i][j + 1] + score[i][j + 2],
                        (float) (score[i][j] + score[i][j + 1] + score[i][j + 2]) / score[i].length);
            }
        }
        System.out.println("--------------------------");
        System.out.printf("총점\t%d\t%d\t%d\n", kor, eng, mat);
    }
}
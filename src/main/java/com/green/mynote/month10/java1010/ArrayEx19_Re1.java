package com.green.mynote.month10.java1010;

public class ArrayEx19_Re1 {
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
        int kortotal=0, engtotal=0, mattotal=0;
        //
        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("-------------------------------------");
        //
        for(int i=0; i<score.length; i++) {
            int sum = 0;
            float avg = 0f;
            // 각 과목별 점수 구하는 코드
            kortotal += score[i][0]; // 국어점수
            engtotal += score[i][1]; // 영어점수
            mattotal += score[i][2]; // 수학점수
            // 번호 1 2 3 4 5 출력
            System.out.printf("%2d", i + 1);
            // n번 학생의 과목 총점 구하는 코드
            for(int j=0; j<score[i].length; j++){
                sum += score[i][j];
                System.out.printf("%5d", score[i][j]);
            }
            // n번 학생의 평균 구하는 코드
            avg = (float) sum / score[i].length;
            System.out.printf("%5d %5.1f\n", sum, avg); // 평균 구하는 코드
        }
        // 모두 학생들의 각 과목 총점 구하기
        System.out.println("-------------------------------------");
        System.out.printf("총점: %d%4d%4d\n", kortotal, engtotal, mattotal); // 총점 구하는 코드
    }
}

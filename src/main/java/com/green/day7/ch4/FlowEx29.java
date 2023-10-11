package com.green.day7.ch4;

public class FlowEx29 {
    public static void main(String[] args) {
        /*
        3 6 9
        3의 배수일 때만 "짝"
         */
        for (int i = 1; i < 101; i++) {
            System.out.printf("i=%d", i);
            //
            int hu = i;
            int ten = hu % 10; // 10을 나눈다고 생각하기
            String gro = "짝";
            //
            do {
                if (ten % 3 == 0 && ten != 0) { // 3의 배수인지 확인(0은 제외)
                    System.out.print(gro);
                }
            }
            while ((hu /= 10) != 0); //
            System.out.println();
        }
    }
}

package com.green.mynote.month10.java1004;

public class DoWhileRe {
    public static void main(String[] main){
        /*
        3 6 9 게임
        3의 배수에서 짝 출력
         */
        for(int i=0; i<10; i++) {
            System.out.printf("i=%d ", i);
            //
            int tmp = i;
            //
            do {
                if(tmp%10%3==0 && tmp%10 != 0) // tmp /= 10 , tmp = tmp / 10 과 동일
                    System.out.print("짝");
            }
            while ((tmp /= 10) != 0);
            System.out.println();
        }
    }
}

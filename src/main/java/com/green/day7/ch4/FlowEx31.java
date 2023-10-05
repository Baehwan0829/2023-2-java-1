package com.green.day7.ch4;

public class FlowEx31 {
    public static void main(String[] args) {
        /*
        0 ~ 10 반복 (11번 반복)
        3의 배수는 0 포함 출력이 안되도록
         */
        for(int i=0; i<11; i++){
            if( i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("----------");
        //
        int thr = 0;
        while (thr<10){
            thr++;
            if( thr % 3 == 0)
                continue;
            System.out.println(thr);
        }
    }
}

package com.green.day7.ch4;

public class BreakContinue {
    public static void main(String[] args){
        /*
        Break : switch, 반복문
        Continue : 반복문
         */
        for(int i=0; i<10; i++){
            System.out.println(i); // Break : 날 감싸고 있는 제일 가까운 숫자에서 끝난다.
            if( i == 5) {
                break;
            }
            System.out.println("-------------------------");
            for (i = 0; i <10 ; i++) {
                System.out.println(i);
                if(i % 2 == 0 ){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}

package com.green.day5.ch4;

public class MultiFor {
    public static void main(String[] args){
        for(int h=0; h<10; h++){

            for(int m=0; m<7; m++){
                // for문을 반복할 때 중첩 for문을 사용한다.
                System.out.printf("h : %d - m : %d\n" , h, m);
            }
        }
    }
}

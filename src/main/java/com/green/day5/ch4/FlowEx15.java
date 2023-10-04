package com.green.day5.ch4;

import java.util.Scanner;

public class FlowEx15 {
    public static void main(String[] args){
        /*
        6x1 =6
         */
        // Scanner를 이용하여 구구단 입력
         final int DAN = 6;
        for(int i=1; i<10; i++){
            System.out.printf("%s x %s = %s \n" , DAN ,i ,DAN*i);
        }
    }
}

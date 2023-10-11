package com.green.day10.ch5;

//p.229

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrEx4 {
    public static void main(String[] args) {
        //
        Scanner s =  new Scanner(System.in);
        //
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        //
        for(int i=0; i< words.length; i++){
            System.out.printf("Q%d.%s의 뜻은 : " , i+1, words[i][0]);
            String name = s.nextLine();
            //
            String aa = words[i][0];
            if( name.equals(aa)){
                System.out.println("정답입니다.");
            }
            else{
                System.out.printf("틀렸습니다. 정답은 %s입니다\n", aa);
            }
        }
    }
}

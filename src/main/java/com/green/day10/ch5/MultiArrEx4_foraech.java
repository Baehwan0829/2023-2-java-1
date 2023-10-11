package com.green.day10.ch5;

//p.229

import java.util.Scanner;

public class MultiArrEx4_foraech {
    public static void main(String[] args) {
        //
        Scanner s =  new Scanner(System.in);
        //
        String[][] words = {
                {"chair", "의자"},
                {"computer", "컴퓨터"},
                {"integer", "정수"},
        };
        System.out.println("======================================");
        int z = 1;
        for(String[] aaa : words){
            System.out.printf("Q%d.%s의 뜻은 : " , z++, aaa[0]);
            String name = s.nextLine();
            //
            String aa = aaa[1];
            if( !name.equals(aa) ){
                System.out.printf("틀렸습니다. 정답은 %s입니다\n", aa);
                continue;
            }
            System.out.println("정답입니다.");
        }
    }
}

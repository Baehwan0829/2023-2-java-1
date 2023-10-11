package com.green.mynote.month10.java1004;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] main){
        int MIN = 0;
        int MAX = (int)(Math.random() * 10000) + 1;
        //
        Scanner s = new Scanner(System.in);
        //
        do{
            System.out.print("MIN~MAX에서의 숫자를 입력하세요 : ");
            MIN = s.nextInt();;
            //
            if ( MIN < MAX ){
                System.out.println("up");
            }
            else if ( MIN > MAX ) {
                System.out.println("down");
            }
        }
        while ( MIN != MAX );
            System.out.println("End");
    }
}

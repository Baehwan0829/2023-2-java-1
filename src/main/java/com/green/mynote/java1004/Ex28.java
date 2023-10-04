package com.green.mynote.java1004;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] main){
        int hu = 0;
        int ten = (int)(Math.random() * 5000) + 1;
        //
        Scanner s = new Scanner(System.in);
        //
        do{
            System.out.print("1~5000에서의 숫자를 입력하세요 : ");
            hu = s.nextInt();;
            //
            if ( hu < ten ){
                System.out.println("up");
            }
            else if ( hu > ten ) {
                System.out.println("down");
            }
        }
        while ( hu != ten );
            System.out.println("End");
    }
}

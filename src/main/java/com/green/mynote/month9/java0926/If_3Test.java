package com.green.mynote.month9.java0926;



public class If_3Test {
    public static void main(String[] args){
        // val값이 홀수면 > "홀수"
        // val값이 짝수면 > "짝수"
        int val = (int)(Math.random() * 100 ) + 1;
        //
        if( val % 2 == 0){
            System.out.printf("%d는(은) %s입니다\n" , val, val % 2 == 0 ? "짝" : "홀");
        }
    }
}

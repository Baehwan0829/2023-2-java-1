package com.green.day10.ch6;


public class MethodExam {
    //
    //
    //
    void checkZero(int n){
        System.out.printf(n==0? "0 입니다" : "0이 아닙니다\n");
        //
        if (n == 0){
            System.out.println("0입니다.");
        }
        else {
            System.out.println("0이 아닙니다.");
        }
        //
        if (n == 0){
            System.out.println("0입니다.");
            return; // void문에서도 return 이 가능!!
        }
        System.out.println("0이 아닙니다.");
    }
    /////////////////////////////////////////////////////////////
    //
    int randomValFromTo(int r , int n){
        return (int)(Math.random() * ( n - r + 1)) + r;
    }
    /////////////////////////////////////////////////////////////
    //
    void scoreResultPrint(int n){
        if ( 0 > n || n > 100){
            System.out.println("잘못된 점수");
        }
        else if( n >= 90 ){
            System.out.println("A");
        }
        else if ( n >= 80){
            System.out.println("B");
        }
        else if ( n >= 70) {
            System.out.println("c");
        }
        else {
            System.out.println("D");
        }
    }
    /////////////////////////////////////////////////////////////
    //
    void scoreResultPrint1(int n){
        if ( 0 > n || n > 100){
            System.out.println("잘못된 점수");
            return;
        }
        String grade = "D";
        if(n >= 90){
            grade = "A";
        }
        else if(n >= 80){
            grade = "B";
        }
        else if(n >= 70){
            grade = "C";
        }
        System.out.printf("%s학점\n", grade);
    }
}

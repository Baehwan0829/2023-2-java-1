package com.green.day11.ch6;

public class MethodExam2 {
    // 내가 만든거
    String scoreResultOpt(int n){
        //
        if ( n < 0 || 100 < n){
            return ("값 확인");
        }
        //
        else if(n >= 90){
            if ( n >= 98 ) {
                return ("A+");
            }
            else if (93 >= n){
                return ("A-");
            }
            else {
                return ("A");
            }
        }
        //
        else if(n >= 80){
            if ( n >= 88 ) {
                return ("B+");
            }
            else if (93 >= n){
                return ("B-");
            }
            else {
                return ("B");
            }
        }
        //
        else if(n >= 70){
            if ( n >= 78 ) {
                return ("C+");
            }
            else if (73 >= n){
                return ("C-");
            }
            else {
                return ("C");
            }
        }
        //
        else{
            return ("D");
        }
    }
    // 변경식
    String scoreResultOpt1(int n){
        //
        if ( n < 0 || 100 < n){
           return ("값 확인");
        }
        //
        String grade = "C";
        if(n == 100) {
            return "A+";
        }
        else if(n < 70) {
            return "D";
        }
        else if(n >= 90) {
            grade = "A";
        }
        else if(n >= 80) {
            grade = "B";
        }
        //
        String pm = "0";
        int a = n % 10;
        //
        if(a >= 8) {
            pm = "+";
        }
        else if(a <= 3) {
            pm = "-";
        }
        return grade + pm;
    }
    // switch문 이용 계절출력
    String getSeason(int n){
        //
        switch ( n ){
            case 3,4,5:
                return "봄";
            case 6,7,8:
                return "여름";
            case 9,10,11:
                return "가을";
            case 12,1,2:
                return "겨울";
        }
        return "";
    }
    //
}



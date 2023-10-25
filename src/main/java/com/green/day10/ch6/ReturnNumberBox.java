package com.green.day10.ch6;

public class ReturnNumberBox {
    //
    // void 와 int 의 차이점 n차 가공이 필요할 때 void를 쓴다.
    // return method가 더 유연하다.
    //
    // class 내에서 변수를 선언했을 경우 : Member field
    // method 내에 변수를 선언했을 경우 : Member Method
    //
    int sum(int n1, int n2){
        return  n1 + n2;
    }
    //
    int abs(int n1){
        return n1 > 0 ? n1 : -n1;
    }
    int bbs(int n){
        if( n < 0) {
            return -n; // 대입 연산자가 없으니 안된다.
        }
        return n;
    }
}

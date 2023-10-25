package com.green.mynote.month10.java1011;

public class MethodExtrytest {
    public static void main(String[] args) {
        //
        // 객체 공간
        //
        MethodExtry met = new MethodExtry();
        //
        // 1. MethodExtry참조하기 위해 변수 met 선언
        // 2. new MethodExtry 인스턴스를 생성
        // 3. 생성된 참조변수 met에 인스턴스 주소를 저장
        //
        int r = met.methodExInt(10, 10);
        System.out.println("r :" + r);
        /*
         methodExInt(10 , 10) 이라는 지정된 주소값을 Class 공간에 받아올 수 있도록 생성
         정수형타입의 r 에 값을 저장하고 r 을 출력한다.
         int method 인 경우 객체 공간 안에 출력문을 작성
        */
        System.out.println("===============================");
        //
        MethodExtry met1 = new MethodExtry();
        //
        // 1. MethodExtry참조하기 위해 변수 met1 선언
        // 2. new MethodExtry 인스턴스를 생성
        // 3. 생성된 참조변수 met에 인스턴스 주소를 저장
        //
        met1.sum(30, 20);
        /*
         sum(30, 20)이라는 지정된 주소값을 Class 공간에 받아올 수 있도록 생성
         Class 공간에 30 과 20이 입력이 된다.
         void method 인 경우 클래스 공간 안에 출력문 작성을
        */
    }
}

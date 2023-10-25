package com.green.day13.ch6;

public class MyMathTest2 {
    public static void main(String[] args) {
        //
        // static int stNum : 값은 다르지만 같은 방을 공유한다.
        //
        MyMath2 mm2 = new MyMath2();
        mm2.num = 10;
        mm2.stNum = 30;
        System.out.printf("1. mm2 : %d, mm2.stNum : %d\n"
                , mm2.num, mm2.stNum);
        // : 30
        //
        MyMath2 mm2_2 = new MyMath2();
        mm2_2.num = 100;
        mm2_2.stNum = 50;
        System.out.printf("2. mm2_2 : %d, mm2_2.stNum : %d\n"
                , mm2_2.num, mm2_2.stNum);
        // : 50
        //
        System.out.printf("3. mm2.stNum : %d, mm2_2.stNum : %d\n"
                , mm2.stNum, mm2_2.stNum);
        // : 50
        //
        System.out.printf("4. MyMath2.staticNum = %d\n", MyMath2.stNum);
        // : 50
        //
        // System.out.println();
        // System.out. : 객체 주소값+, 래퍼런스 변수라는 걸 알 수 있다.
        // 파라미터( )가 뒤에 붙으면 Method, ( )가 없으면 MemberFiled
        //
    }
}

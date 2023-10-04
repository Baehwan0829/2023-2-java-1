package com.green.day2.ch2;

import java.util.Date;

public class Naming {
    public static void main(String[] args){
        // 1. 대소문자 구별, 길이 제한 x
        //int abc, aBc, abC;

        // 2. 이름으로 예약어 사용 x
        // int int, void, static;

        // 3. 숫자로 시작해서 안된다. ( 처음만 아니면 된다 )
        // int 1ab;
        int a1b, ab1;

        // 4. 특수 문자는 _, $만 가능
        int _ab, $ab;

        //-------------------------------------------------

        // 케이스 기법
        // hello my name is hong

        // * 1. 파스칼 케이스 기법 ( 클래스명 ) > 대문자로 시작 : 참조타입
        // HelloMyNameIsHong

        // * 2. 카멜 케이스 기법 ( 변수명, 메소드명 ) > 소문자로 시작 : 프라모티브타입
        // helloMyNameIsHong

        // 3. 케밥 케이스 기법
        // hello-my-naem-is-hong : 특수기호 _ 가 아니기에 <> - (하이푼)

        // 4. 스네이크 케이스 기법
        // hello_my_name_is_hong : 사용은 가능하나 쓰지는 않는다.

        // Web : http
        //-------------------------------------------------
        //상수는 전부 대문자 구분은 언더바

        // 실수형 double 주로 쓰기

        // PI, MAX_NUMBER
        final int PI = 0, MAX_NUMBER = 10;

        // 상수는 앞에 final이 붙는다.
        // 상수는 한번 입력된 값이 변경되지 않는다, 리터럴은 변경이 가능한 함수

        Date today = new Date(); // 대문자로 시작할 땐 래퍼런스 타입 ( 참조 )
    }
}


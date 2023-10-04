package com.green.day1;

public class VarEx1 {
    public static void main(String[] args){
        // 변수에 가지고있는 값을 내가 사용할 수 있다
        // 변수선언 후 읽거나 사용
        // = 기준 오른쪽 값을 왼쪽에 대입
        int year = 0;
        int age = 14;
        //리터럴 값 그 자체인 상수

        int a = 0, b = 0;
        int c = 10;
        System.out.println(c);
        //
        System.out.println(year);
        //
        year = 100;
        System.out.println(year);
        // year 출력 후 year 값을 변경하면 그 값이 출력
        System.out.println(age + age + age);

        /*
        int year = 2000;
        int mouth = 8;
        int day = 29;
        int age = 23;

        System.out.println("생년 : " + year);
        System.out.println("월 : " + mouth);
        System.out.println("일 : " + day);
        System.out.println("나이 : " + age);
        */
    }
}

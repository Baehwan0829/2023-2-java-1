package com.green.day10.ch6;

public class Tvtest {
    // main method : 소프트웨어의 시작점
    public static void main(String[] args) {
        /*
         대문자로 시작하면 래퍼런스, 참조변수
         대문자로 시작하면 주소값을 저장, 내가 변수로 선언한 값만 저장
        */
        //
        // String : null , 주소값이 없다
        // boolean : false , default값은 false
        // int : 0 , default값은 0
        //
        String str = new String("dd");
        //
        // 객체를 생성할 때
        // 주소값이 다르다
        Tv tv1 = new Tv(); // new 클래스명();
        tv1.channel = 10;
        tv1.power = true;
        tv1.color = "파랑색";
        //
        Tv tv2 = new Tv();
        Tv tv3 = tv1;
        //
        System.out.println("tv1 == tv2 : " + (tv1 == tv2)); // 주소값이 같은지 비교
        System.out.println("tv1 == tv2 : " + (tv1 == tv3)); // 주소값이 같다.
        System.out.println("============================");
        System.out.println("tv1.channl : " + tv1.channel);
        System.out.println("tv1.power : " + tv1.power);
        System.out.println("tv1.color : " + tv1.color);
        System.out.println("============================");
        System.out.println("tv2.channl : " + tv2.channel);
        System.out.println("tv2.power : " + tv2.power);
        System.out.println("tv2.color : " + tv2.color);
    }
}

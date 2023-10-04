package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args) { // print ln 개인행렬 , t 일렬행렬 , ( \n 가독성 )
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("----------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.println("----------");
        System.out.print("Halo\n"); // escape 함수
        System.out.print("Halo\n");
        System.out.print("Halo\n");
        System.out.println("---------");

        String name = "홍길동";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;

        int year = 2000;
        char month = '9';
        long day = 21;

        // 제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 B이고, 키는 178.8cm 입니다.
        // printf : ( 문자열 안에 변수가 가지고있는 값을 주입
        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "세이고, 혈액형은 " + bloodType + "형이고, 키는 " + height + "cm입니다.");

        System.out.printf("제 이름은 %s이고, 나이는 %03d세이고, 혈액형은 %c형이고, 키는 %fcm입니다." , name, age, bloodType, height);
        System.out.printf("제 이름은 %s이고, 생년월일은 %4d년,%s월,%02d일입니다." , name, year, month, day);

        // 정의 vs 사용 (아규먼트 : 인자 인수)
    }
}

package com.green.day2.ch3;

// p.113
public class OperatorEx23 {
    public static void main(String[] args){
        String s1 = "Hello", s2 = "Hello";
        String s3 = new String("Hello");

        /*
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        */

        System.out.printf("%s == %s : %b\n", s1, s2, s1 == s2); // 같은 파일, 같은 메모리영역에서 참조하여 비교, 주소값 비교
        System.out.printf("%s == %s : %b\n", s1, s3, s1 == s3);
        System.out.printf("%s.equals(%s) : %b\n", s1, s3, s1.equals(s3));
        System.out.printf("%s.equals(%s) : %b\n", s3, s1, s3.equals(s1)); // JAVA에선 비교연산자 equals 메소드는 써야한다.

        // reference type에서 == 비교는 주소값 비교
    }
}

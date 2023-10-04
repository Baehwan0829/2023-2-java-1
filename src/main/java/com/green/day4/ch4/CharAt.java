package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args){
        // String str = "abcdefghijk".toUpperCase(); // 배열은 항상 0번부터 시작
        String str = "abcdefghijk";
        String str2 = str.toUpperCase();
        System.out.println("str : " + str );
        System.out.println("str3 : " + str2 );
        //
        System.out.println("result0 : " + str.charAt(0));
        char result = str.charAt(1);
        System.out.println("result1 : " + result);
        System.out.println("result2 : " + str.charAt(2));
    }
}

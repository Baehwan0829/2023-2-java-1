package com.green.mynote.java0926;


import java.util.Scanner;

public class If_Test0926 {
    public static void main(String[] args){
        /*
         Scanner 이용
         문자열로 남자 남 man Man
                 여자 여
                 남자는 굿
                 여자는 나이스
        */
        Scanner s = new Scanner(System.in);
        System.out.print("성별을 입력하세요 : ");
        String gender = s.nextLine();
        System.out.println();
        //
        if("남자".equals(gender) || "남".equals(gender) || "man".equals(gender) || "Man".equals(gender)){
            System.out.print("굿");
        }
        else if("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)) {
            System.out.print("나이스");
        }
    }
}

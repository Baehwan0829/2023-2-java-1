package com.green.mynote.java1004;

import java.util.Scanner;

public class IFRE {
    public static void main(String[] args) {
        /*
        if 다시하기
         */
        Scanner s = new Scanner(System.in);
        System.out.print("성별을 입력하세요 : ");
        String gender = s.nextLine();
        System.out.print("생년월일을 입력하세요 : ");
        int year = s.nextInt();
        System.out.print("나이를 입력하세요 : ");
        int age = s.nextInt();
        //
        if(("남자").equals(gender) || ("남").equals(gender) || ("신사").equals(gender) || ("수컷").equals(gender) ){
            if(age > 45){
                System.out.println("중년남성");
            }
            else if(age >= 19){
                System.out.println("청년남성");
            }
            else if(age < 19) {
                System.out.println("미성년자");
            }
        }
        else if(("여자").equals(gender) || ("여").equals(gender) || ("숙녀").equals(gender) || ("암컷").equals(gender) ){
            if(age > 45){
                System.out.println("중년여성");
            }
            else if(age >= 19){
                System.out.println("청년여성");
            }
            else if(age < 19) {
                System.out.println("미성년자");
            }
        }
        System.out.println("-----------------------------------------");
    }
}

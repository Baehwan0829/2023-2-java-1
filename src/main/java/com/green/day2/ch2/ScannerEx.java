package com.green.day2.ch2;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // 객체화 만드는 변수 Instuns
        // 객체의 주소값
        // 객체 : 속성( 값 저장, 명사 ) 과 메소드( 기능, 동사 )
        // 내가 출력한 값이 입력되는 명령어 Scanner
        System.out.print("두 자리 정수를 하나 입력해주세여 >> ");
        String input = scan.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("입력내용 :" + input);
        System.out.printf("num=%d\n", num);
    }
}

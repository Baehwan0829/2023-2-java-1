package com.green.mynote.month9.java0926;

import java.util.Scanner;


public class IfTest {
    public static void main(String[] args) {
        //
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해주세요 : ");
        String gender = scan.nextLine();
        System.out.print("태어난 년도를 입력해주세요 :");
        int year = scan.nextInt();
        System.out.print("나이를 입력해주세요 : ");
        int age = scan.nextInt();
        //
        if (("남자").equals(gender)) {
            if (age > 65) {
                System.out.printf("남자의 %d년생의 나이는 %d세이며, 노년계층입니다.\n", year, age);
            }
            else if (age > 45) {
                System.out.printf("남자의 %d년생의 나이는 %d세이며, 중년계층입니다.\n", year, age);
            }
            else if (age >= 19) {
                System.out.printf("남자의 %d년생의 나이는 %d세이며, 청년계층입니다.\n", year, age);
            }
            else {
                System.out.printf("남자의 %d년생의 나이는 %d세이며, 미성년계층입니다.\n", year, age);
            }
        } else if(("여자").equals(gender)) {
            if (age > 65) {
                System.out.printf("여자의 %d년생의 나이는 %d세이며, 노녀계층입니다.\n", year, age);
            }
            else if (age > 45) {
                System.out.printf("여자의 %d년생의 나이는 %d세이며, 중녀계층입니다.\n", year, age);
            }
            else if (age >= 19) {
                System.out.printf("여자의 %d년생의 나이는 %d세이며, 청녀계층입니다.\n", year, age);
            }
            else {
                System.out.printf("여자의 %d년생의 나이는 %d세이며, 미성녀계층입니다.\n", year, age);
            }
        }
    }
}

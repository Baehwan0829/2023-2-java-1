package com.green.day3.ch4;

import java.util.Scanner;

public class FlowEx5Mission {
    public static void main(String[] args){
        // 남자의 평균키 170, 여자 평균키 157
        // Scanner 이용하여 성별을 입력 받습니다 ( 남, 여 );
        // 키를 입력받습니다
        // 평균키 미만이면 "156cm는 남자 평균 이하입니다."
        // 평균키와 같다면 "170cm는 남자 평균입니다."
        // 평균키 초과면 "170cm는 남자 평균 초과입니다."

        // 평균키 미만이면 "146cm는 여자 평균 이하입니다."
        // 평균키와 같다면 "157cm는 여자 평균입니다."
        // 평균키 초과면 "170cm는 여자 평균 초과입니다."
        //
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력 해주세요 : "); // 성별 입력
        String gender = scan.nextLine();
        System.out.print("키를 입력 해주세요 : "); // 키 입력
        int height  = scan.nextInt();
        //
        if ("남자".equals(gender)) {
            if (height > 170) {
                System.out.printf("%dcm는 남자 평균 초과입니다.\n", height);
            }
            else if (height < 170) {
                System.out.printf("%dcm는 남자 평균 이하입니다.\n", height);
            }
            else {
                System.out.printf("%dcm는 남자 평균입니다.\n", height);
            }
        } else {
            if (height > 157 ) {
                System.out.printf("%dcm는 여자 평균 초과입니다.\n", height);
            }
            else if (height < 157 ) {
                System.out.printf("%dcm는 여자 평균입니다.\n", height);
            }
            else {
                System.out.printf("%dcm는 여자 평균 이하입니다.\n", height);
            }
        }
    }
}

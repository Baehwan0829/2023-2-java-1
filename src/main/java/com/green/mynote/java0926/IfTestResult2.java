package com.green.mynote.java0926;

import java.util.Scanner;


public class IfTestResult2 {
    public static void main(String[] args) {
        /*
          이름 성별 나이 주민등록번호 기재하기
          남자, 남, man, Man
          여자, 여, woman, Woman
          나이가 65세 이상일 경우 노년층
                45세 이상이면 중년
                19세 이상이면 청년
                19세 이하면 미성년
          || : OR 연산자 논리식 중 하나라도 참이면 true
          && : AND 연산자 논리식 중 모두 참이면 true
         */
        Scanner s = new Scanner(System.in);
        System.out.printf("이름을 적어주세요 : ");
        String name = s.nextLine();
        //
        System.out.print("성별 기재 : ");
        String gender = s.nextLine();
        //
        System.out.print("주민등록번호 앞자리를 기재 :");
        String humanID = s.nextLine();
        //
        System.out.print("나이를 기재 : "); // null.nextLine(); 을 null.nextInt보다 먼저 입력하기
        int age = s.nextInt();
        //
        String msg = "미취학이니 조회가 불가합니다.";
        //
        if ("남자".equals(gender) || "남".equals(gender) || "man".equals(gender) || "Man".equals(gender)) {
            if (age > 65) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 노년계층입니다.\n", name, gender, age, humanID);
            } else if (age > 45) {
                System.out.printf("%s님의 성별은(는) %s, %d이며, 주민등록번호는 %s이므로 중년계층입니다.\n", name, gender, age, humanID);
            } else if (age > 19) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 청년계층입니다.\n", name, gender, age, humanID);
            } else if (age < 19) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 미성년계층입니다.\n", name, gender, age, humanID);

            }
        } else if ("여자".equals(gender) || "여".equals(gender) || "woman".equals(gender) || "Woman".equals(gender)) {
            if (age > 65) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 노년계층입니다.\n", name, gender, age, humanID);
            }
            else if (age > 45) {
                System.out.printf("%s님의 성별은(는) %s, %d이며, 주민등록번호는 %s이므로 중년계층입니다.\n", name, gender, age, humanID);
            }
            else if (age > 19) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 청년계층입니다.\n", name, gender, age, humanID);
            }
            else if (age < 19) {
                System.out.printf("%s님의 성별은(는) %s, %d세이며, 주민등록번호는 %s이므로 미성년계층입니다.\n", name, gender, age, humanID);
            }
        }
    }
 }


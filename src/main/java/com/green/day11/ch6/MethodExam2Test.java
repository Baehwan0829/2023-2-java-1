package com.green.day11.ch6;

public class MethodExam2Test {
    public static void main(String[] args){
        //
        /*
        100 초과 0 미만 " 점수를 확인 "
        A 학점 8이상 + 3점 이하 - , 나머지는
        B 학점 8이상 + 3점 이하 - , 나머지는
        c 학점 8이상 + 3점 이하 - , 나머지는
        D 학점 X
         */
        // 정수형으로 보냈지만 return 하는 값은 String으로 받는다
        //
        MethodExam2 me2 = new MethodExam2(); // 객체화
        String r1 =  me2.scoreResultOpt(100);
        System.out.println("r1 : " + r1);
        String r2 =  me2.scoreResultOpt(101);
        System.out.println("r2 : " + r2);
        //
        System.out.println("===========================");
        MethodExam2 me3 = new MethodExam2();
        String r4 =  me3.scoreResultOpt1(100);
        System.out.println("r4 : " + r4);
        String r5 =  me3.scoreResultOpt1(101);
        System.out.println("r5 : " + r5);
        //
        System.out.println("===========================");
        MethodExam2 me4 = new MethodExam2();
        String season = me4.getSeason(10);
        System.out.println("계절 : " + season);
        String season1 = me4.getSeason(4);
        System.out.println("계절 : " + season1);
        //
        System.out.println("===========================");
    }
}

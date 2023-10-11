package com.green.day10.ch6;

public class MethodExamTest {
    public static void main(String[] args) {
        //
        MethodExam me = new MethodExam();
        me.checkZero(10);
        me.checkZero(9);
        me.checkZero(8);
        me.checkZero(0);
        //
        System.out.println("=============");
        int r = me.randomValFromTo(10, 100);
        System.out.println("r : " + r);
        //
        System.out.println("=============");
        int r1 = me.randomValFromTo(5, 9);
        System.out.println("r1 : " + r1);
        //
        System.out.println("=============");
        me.scoreResultPrint(101); // 잘못된 점수
        me.scoreResultPrint(100); // A
        me.scoreResultPrint(85); // B
        me.scoreResultPrint(79); // C
        me.scoreResultPrint(69); // D
        //
        System.out.println("=============");
        me.scoreResultPrint1(101); // 잘못된 점수
        me.scoreResultPrint1(100); // A
        me.scoreResultPrint1(85); // B
        me.scoreResultPrint1(79); // C
        me.scoreResultPrint1(69); // D
    }
}

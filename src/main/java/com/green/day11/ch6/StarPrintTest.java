package com.green.day11.ch6;

public class StarPrintTest {
    public static void main(String[] args) {
        StarPrint sp = new StarPrint();
        System.out.println("==========StarPrint==========");
        sp.line(5);
        sp.line(8);
        //
        System.out.println("===========Suting==========");
        String r1 = sp.Suting(10);
        System.out.println(r1);
        //
        System.out.println("==========square=========");
        sp.square(4);
        System.out.println("=========triangle==========");
        sp.triangle(4);
        //
        System.out.println("=========gender==========");
        String gender = sp.chkGenderById("011231-21171111");
        System.out.println("성별 : " + gender);
        String gender1 = sp.chkGenderById("011231-31171111");
        System.out.println("성별 : " + gender1);
        //
        System.out.println("=======  MIN ~ MAX + =========");
        int sum = sp.sumFromTo(4,10);
        int sum2 = sp.sumFromTo(10,15);
        System.out.println(sum);
        System.out.println(sum2);
        //
    }
}
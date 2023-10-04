package com.green.day5.ch4;

public class FlowEx12 {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            System.out.println(i);
        }
        System.out.println("-----------------1");
        for(int i=0; i<5; i++) {
            System.out.print(i); //
        }
        System.out.println();
        System.out.println("-----------------2");
        //
        for(int i=0; i<5; i++) {  // 0 5 안 바꾸고 출력문을 증가하는법
            System.out.print(i);
        }
        System.out.println();
        System.out.println("-----------------3");
        //
        for(int i=92; i<=96; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("-----------------4");
        //
        for(int i=6; i>0; i--) {  // i 증가값이 -- 일 경우 비교연산자를 반대로 해준다.
            System.out.print("*");
        }
        System.out.println();
        System.out.println("-----------------5");
    }
}

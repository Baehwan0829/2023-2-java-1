package com.green.mynote.month9.java0927;

public class FlowEx12Re {
    public static void main(String[] args){
        //
        for(int i=1; i<=5; i++){
            System.out.println(i); // 오름차순 방식으로 출력된다.
        }
        System.out.println("-----------------1");
        //
        for(int i=0; i<5; i++) {
            System.out.print(i); // 가로방향 오름차순으로 출력된다.
        }
        System.out.println();
        System.out.println("-----------------2");
        //
        for(int i=0; i<5; i++) {  // 0 5 안 바꾸고 출력을 증가하는법
            System.out.print(i+1); // 출력문에 + n값을 해주면 값이 변한다.
        }
        System.out.println();
        System.out.println("-----------------3");
        //
        for(int i=92; i<=96; i++) { // i값이 바뀌면 i값에 맞게 비교를 해준다
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

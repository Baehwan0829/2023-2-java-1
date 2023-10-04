package com.green.day3.ch4;

public class AssignmentOperator2 {
    public static void main(String[] args){
        int r1 = 0, n1 = 0, a1 = 0;
        r1 = ++n1; // ++ 앞에 붙으면
        ++a1; // 값을 변경하는 쓰기
        System.out.printf("r1 : %d, n1 : %d, a1 : %d\n", r1, n1, a1 );

        int r2 = 0, n2 = 0, a2 = 0;
        r2 = n2++; // ++ 뒤에 붙으면
        a2++; // 값을 변경하는 쓰기 및 읽기
        System.out.printf("r2 : %d, n2 : %d, a2 : %d\n", r2, n2, a2 );
    }
}

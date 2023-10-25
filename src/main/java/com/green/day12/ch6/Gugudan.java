package com.green.day12.ch6;

public class Gugudan {
    //
    // GuGuDan
    void print(int n){
        for(int i=1; i<=9; i++){
            System.out.printf("%d x %d = %d\n", n, i, (n*i));
        }
    }
    //
    // 이중 for문 GuGuDan
    void printFromTo(int n1, int n2){
        for (int i = n1; i <= n2; i++) {
            print(i);
        }
    }
    //
    // 이중 for문 GuGuDan ( 파라미터 ( int, String ) )
    // 오버로딩 : 같은 이름사용가능, 파라미터가 다르면 타입에 맞게 찾아 들어간다.
    void printFromTo(int n1, int n2, String a){
        for (int i = n1; i <= n2; i++) {
            print(i);
            System.out.println(a);
        }
    }
    //
    //

}

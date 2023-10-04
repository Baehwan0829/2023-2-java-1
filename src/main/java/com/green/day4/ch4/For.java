package com.green.day4.ch4;

public class For {
    public static void main(String[] args){
        // 첫번째 : 초기화 공간
        // 두번째 : 반복여부 체크
        // 세번째 : 증감식
        for(int i=0; i<5; i++ ){
            System.out.println("목");
        }
        //
        int j = 0;
        for( ; j<10; ){
            System.out.println("j : " + j++);
            // ++가 앞에 붙을 경우 읽고 쓰는 차이가 있다 ex) ++j 1부터 시작
            // ++가 뒷에 붙을 경우 ex) j++ 0부터 시작
        }
    }
}

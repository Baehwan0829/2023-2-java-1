package com.green.mynote.java0927;

public class FlowEx13Re {
    public static void main(String[] args){
        /*
          반복문을 사용하여 랜덤한 값을 더하여  그 값을 출력
          Random 함수를 이용하여 응용해보기
         */
        //
        int num = (int)(Math.random() * 500);
        for(int i=1; i>=num; i++){
        }
        System.out.println("num : " + num);
    }
}

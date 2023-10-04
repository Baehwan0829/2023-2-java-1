package com.green.mynote.java0926;

public class If_4Test {
    public static void main(String[] args){
        /*
            40 ~ 300 사이의 랜덤 값
            150 이하면 그 값의 * 2한 결과값
            150 초과면 그 값의 + 10한 결과값
        */
        int val = (int)(Math.random() * 261) + 40;
        int result = 0;
        //
        if ( val <= 150 ){
            result = val * 2; // val 값이 이하일 경우 result 값에 val * 2를 대입한다.
        }
        else {
            result = val + 10; // val 값이 이상일 경우 result 값에 val + 10를 대입한다.
        }
        System.out.println("val : " + val); // 랜덤으로 나온 val값을 출력
        System.out.println(result); // 랜덤으로 나온 값이 * 2를 했는지 + 10를 했는지 확인하여 본다.
    }
}

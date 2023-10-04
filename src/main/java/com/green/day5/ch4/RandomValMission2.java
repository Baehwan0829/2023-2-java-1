package com.green.day5.ch4;

public class RandomValMission2 {
    public static void main(String[] args) {
        /*
        리터널은 x
        MIN, MAX 상수만 사용
        MIN, MAX 나올 수 있는 랜덤 숫자를 만다는 로직
         */
        final int MIN = 15, MAX = 20;
        //
        for(int i=0; i<5; i++){
         int val = (int)(Math.random() * (MAX-MIN+1)) + MIN; // 20 - 15 + 1  : 최솟값이 15
            System.out.println("val : " + val);
            if(val < MIN || val > MAX){ // 비교 연산자 AND연산자
                System.out.println("범위를 벗어났습니다. ");
                break;
            }
        }
        System.out.println("끝!!");
    }
}

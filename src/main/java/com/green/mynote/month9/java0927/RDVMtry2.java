package com.green.mynote.month9.java0927;

public class RDVMtry2 {
    public static void main(String[] args){
        /*
        리터널은 x
        MIN, MAX 상수만 사용
        MIN, MAX 나올 수 있는 랜덤 숫자를 만다는 로직
         */
        final int MIN = 10, MAX = 100;
        //
        for(int i=1; i<=5; i++) {
            int Val = (int) (Math.random() * (MAX - MIN + 1)) + MIN; // 최소값이 10, 최대값이 100일 경우 최대값에서 최소값을 빼고 1을 더해준다
            System.out.println(" Val : " + Val); // %d, %c가 나올 경우에만 , 표시 주의할것
            if(Val < MIN || Val > MAX){
                System.out.println("최소값과 최대값이 아닙니다.");
            }
        }
    }
}

package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseBallGame {
    public static void main(String[] args){
        //
        NumberBaseball nbb = new NumberBaseball(3); // new 뒤에 올 수 있는건 생성자뿐
        nbb.start();
    }
}
//
class NumberBaseball{
    //
    private final int GAME_COUNT;
    private final int[] gameNumbers;
    //
    public NumberBaseball(int a){
        this.GAME_COUNT = a; // 생성자를 통해 상수를 넣을 수 있다.
        this. gameNumbers = new int[a];
    }
    //
    public void setRandNumNotDuplicate(){
        //
        for(int i=0; i<gameNumbers.length; i++){
            gameNumbers[i] = (int)(Math.random() * 10);  //{1, 0, 0}
            for(int j=0; j<gameNumbers.length; j++){
                if(i == j){ continue; }
                if(gameNumbers[i] == gameNumbers[j]){
                    i--;
                    break;
                }
            }
        }
    }
    //
    public void start(){
        System.out.println(Arrays.toString(gameNumbers));
        setRandNumNotDuplicate();
        getUserInput();
    }
    //
    public void getUserInput(){
        Scanner s = new Scanner(System.in);
        final int[] userArr = new int[GAME_COUNT];
        for(int i=0; i<GAME_COUNT; i++){
            System.out.printf("%d 숫자", i+1);
            userArr[i] = s.nextInt();
        }
        //
        boolean r = isContinueCheckResult(userArr);

        s.close();
    }
    //
    public boolean isContinueCheckResult(int[] userArr){
        int strike=0, ball=0, out;
        for(int i=0; i<gameNumbers.length; i++) {
            for (int j = 0; j < userArr.length; j++) {
                if (gameNumbers[i] == userArr[j]) {
                    if (i == j) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        System.out.printf("strike : %d, ball : %d, out : %d\n", strike, ball, out);
        return true;
    }
}
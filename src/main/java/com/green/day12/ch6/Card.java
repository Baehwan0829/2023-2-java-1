package com.green.day12.ch6;

public class Card{
    //
    // 속성 : 객체의 값을 저장
    public String kind;
    public String number;
    //
    //
    // 메소드 : 동적인거
    //
    public int getScore(){
        switch (number){
            case "A":
                return 1;
            case "Q":
                return 12;
            case "J":
                return 11;
            case "K":
                return 13;
        }
        return Integer.parseInt(number);
    }
    //
    public void printYourSelf() {
        System.out.printf("%s (%s)\n", kind, number);
    }
}

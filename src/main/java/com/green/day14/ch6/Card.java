package com.green.day14.ch6;

public class Card {
    String pattern;
    String denomination;
    //

    //
    //         (  생성자 호출  )
    public Card(String pattern, String denomination) {
        // 지역변수는 호출이 끝나면 사라진다.
        this.pattern = pattern;
        this.denomination = denomination;
    }


    //
    void printMySelf(){
       System.out.printf("%s (%s)\n", pattern, denomination);
    }
    //
}

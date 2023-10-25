package com.green.day13.ch6;

import com.green.day12.ch6.Card;

public class CardTest2 {
    public static void main(String[] args) {
        //
        Card[] cards = makeCards(); // static 생성하자 메모리에 올라간다.
        // Card[] cards2 = makeCards(); // 다른 존재 , 공간 크기는 같다.
        //
        System.out.println(cards.length);
        System.out.println("========");
        //
        // cards는 자리개념 c라는 주소값이 계속 바뀐다.
        for(Card c : cards) {
            c.printYourSelf();
        }
        //
    }
    //
    public static String getNumberFromInt(int num){
            switch (num){
                case 1 :
                    return "A";
                case 11:
                    return "J";
                case 12:
                    return "Q";
                case 13:
                    return "K";
            }
            return Integer.toString(num); // String.valueOF(num);
    }
    //
    static Card[] makeCards() {
        //
        Card[] cards = new Card[52];
        // 52개의 배열을 만들어 Card[]타입의 cards에 대입
        String[] k = {"Spade", "Heart", "Diamond", "Club"};
        // String배열 값을 만들어 Stirng[]타입의 k에 대입한다.
        int cnt = 0;
        // 정수형 타입의 cnt변수명을 선언
        //
        for(int i=0; i<k.length; i++){
            // 0과 같고 k의 배열크기만큼 범위를 정한다.
            for(int j=1; j <= 13; j++) {
                // 1과 같고 13보다 작거나 같은 범위를 정한다.
                String n = getNumberFromInt(j);
                // getNumberFromInt에 (j)를 넣어 String타입의 n에 대입한다.
                Card c = new Card();
                // 이중 for문안에 객체화를 해준다
                c.kind = k[i];
                // Card 클래스 내에 있는 kind에 k[i] 배열값을 대입
                c.number = n;
                // Card 클래스 내에 있는 number에 getNumberFromInt(j)을 대입해준 n을 대입한다.
                cards[cnt++] = c;
                // c는 cards[]배열크기를 0번방 부터 51번방까지 증가시킨다.
            }
        }
        return cards;
    }
}
package com.green.day13.ch6;


//
class Card{
    //
    String patten; // Spade
    String denomination; // A , 2~10, J, Q, K
    //
    void printYourSelf(){
        System.out.printf("%s - %s\n", patten, denomination);
    }
    //
   }
public class CardTest3 {
    //
    public static void main(String[] args) {
        Card c = new Card();
        c.patten = "Spade";
        c.denomination = "A";
        c.printYourSelf();
        //
        Card c1 = new Card(); // 카드 객체의 주소값
        c1.patten = "Heart";
        c1.denomination = "J";
        c1.printYourSelf();
        System.out.println("==================");
        //
        // 각 방의 타입은 Card
        Card[] cards = makeCards1(); // 카드배열의 주소값
        System.out.println("cards.length : " + cards.length);
        System.out.println("==================");
        //
        for(Card c2 : cards){
            c2.printYourSelf();
        }
    }
    //
    public static String getNumberFromInt(int n) {
        switch (n) {
            case 1:
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 0:
                return "K";
        }
        return String.valueOf(n);
    }
    //
    // 이중 for문
    public static Card[] makeCards(){
        //
        Card[] cArr = new Card[52];
        String[] p = {"Spade", "Heart", "Club", "Diamond"};
        // String[]에 spade, heart, clud, diamond를 만들어 String[]타입의 p에 대입
        String[] d = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        // "A","J","Q","K","2~10"를 String[]타입의 d에 대입
        int n = 0;
        // 정수형타입의 n값을 0으로 해준다.
        //
        for (int i = 0; i < p.length; i++) {
            // 0과 같고 p의 배열크기만큼 범위를 정한다
            for (int j = 0; j < d.length; j++) {
                // 0과 같고 d의 배열크기만큼 범위를 정한다
                Card c = new Card();
                // 이중 for문안에 객체화를 해준다.
                c.patten = p[i];
                // Card 클래스 내에 있는 patten에 p[i] 배열값을 대입
                c.denomination = d[j];
                // Card 클래스 내에 있는 patten에 d[j] 배열값을 대입
                cArr[n++] = c;
                // c는 cards[]배열크기를 0번방 부터 51번방까지 증가시킨다.
            }
        }
        return cArr;
    }
    //
    // for문
    public static Card[] makeCards1(){
        Card[] cArr = new Card[52];
        String[] p = {"Spade", "Heart", "Diamond", "Club"};
        //
        for(int i=0; i< cArr.length; i++){
            String ps = p[i/13];
            String d = getNumberFromInt((i+1) % 13);
            Card c = new Card();
            cArr[i] = c;
            cArr[i].patten = ps;
            cArr[i].denomination = d;
        }
        return cArr;
    }
}


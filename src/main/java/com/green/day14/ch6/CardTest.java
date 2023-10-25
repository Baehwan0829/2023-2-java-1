package com.green.day14.ch6;

public class CardTest {
    public static void main(String[] args) {
        //
        CardDeck cd = new CardDeck(); // 카드덱을 객체화 및 기본생성자
        cd.printAll();
        //
        System.out.println("==============");
        // Card c1 = cd.getCard();
        // Card c2 = cd.getCard1();
        //
        for(int i=0; i<52; i++){
            System.out.println(i);
            Card c = cd.getCard();
            c.printMySelf();
        }
        System.out.println("=========");
        cd.printAll(); // null 값을 호출했기 때문
    }
    //
}

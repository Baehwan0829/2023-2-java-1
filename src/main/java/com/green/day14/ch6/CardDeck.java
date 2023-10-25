package com.green.day14.ch6;

public class CardDeck {
    //
    Card[] cards; // 래퍼런스타입 ) 카드배열 주소값에 접근한다.
    Card r;
    //
    public CardDeck(){
        cards = new Card[52];
        String[] patterns = {"Spade","Heart","Diamond","Club"};
        int idx = 0;
        for(int i=0; i<patterns.length; i++){
            String pattern = patterns[i];
            for (int z=1; z<=13; z++){
                // static은 this를 사용할 수 없다.
                String denomination = this.getNumberFromInt(z);
                cards[idx++] = new Card(pattern, denomination);
                // cards[idx++] = c;
                // 컬렉션 : 배열
            }
        }
    } // 파라미터가 없는 생성자 : 기본생성자
    //
    // private가 붙으면 같은 클래스 내에서만 사용할 수 있다.
    private String getNumberFromInt(int num){
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
    void printAll(){
        for(Card c : cards) {
            c.printMySelf();
        }
        /*
         for(int i=0; i<cards.length; i++){
            Card c = cards[i];
            c.printMySelf
         */
    }
    //
    Card getCard(){
        for(int i=0; i<cards.length; i++) {
            int val = (int) (Math.random() * cards.length) + 1;
            // (int) Math.random() * cards.length 일 경우
            // i가 0일 경우 (int)Math.random이 먼저 연산되고
            // * cards.length가 연산되면서 0으로 끝난다.
            r = cards[val];
            if (r == r) {
                return r;
            }
        }
        return null;
    }
    //
    // 강사님 코드
    Card getCard1(){
        r = null;
        while (true) {
            // 끝나지 않는 반복문, if, break를 함께 써야한다.
            int val = (int) (Math.random() * cards.length) + 1;
            r = cards[val];
            if (r != null) {
                cards[val] = null;
                break;
            }
        }
        return r; // 스코프문제
    }
}

package com.green.day15.ch7;

class Card extends Object{
    /*
      변수 : ex) String str =
      상수 : 값을 변경할 수 없는 변수 ( final 이 붙을 경우 )
      리트럴 : 고정값을 나타내는 표기
      static : 객체화가 필요없으며, 메모리에 올라간다. 공간이 하나
               클래스명.전역변수명
     //
     final : 마지막의, 변경될 수 없는 ( 오버라이딩을 통한 재지정은 가능하다 )
     static : 클래스의, 공통적인 ( 객체화 필요가 없으며, 메모리에 올라간다. 공간은 하나 )
    */
    static final int NUM_MAX = 13;
    final static int KIND_MAX = 4;
    //
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    //
    int kind;
    int number;

    public Card(int kind, int number) { // ( 오버로딩 생성자 ) 생성
        this.kind = kind;
        this.number = number;
    }
    //
    public String toString(){
        return "kind : " + kind + ", number : " + number;
    }
}
//
class Deck {
    final int CARD_NUM = 52; // 전역변수
    Card[] cards = new Card[CARD_NUM]; // 카드배열의 주소값을 알 수 있다
    //
    public Deck() { // 기본생성자
        int idx = 0;
        for(int i=1; i<=Card.KIND_MAX; i++) {
            for (int z=1; z<=Card.NUM_MAX; z++) {
                cards[idx++] = new Card(i, z);
                }
            }
            //   for(Card c : cards){
            //   System.out.println(c);
        // }
    }
    //
    public Card pick(int a){
         return cards[a];
    }
    //
    public Card pick(){
        return this.pick((int)(Math.random() * cards.length));
    }
    //
    public void shuffle(){
        Card car; // Card[]의 타입은 Card
        for(int i=0; i<this.cards.length; i++){
            int ridx = (int)(Math.random() * this.cards.length);
            if( ridx == i) continue;
            //
            car = cards[i];
            cards[i] = cards[ridx];
            cards[ridx] = car;

        }
        for(Card c : cards) {
            System.out.println(c);
        }
    }
}
public class DeckTest {
    //
    public static void main(String[] args){
        Deck deck = new Deck();
        deck.shuffle();
        System.out.println("------------");
    }
}

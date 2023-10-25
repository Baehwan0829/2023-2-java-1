package com.green.day19.ch7;

public interface PlayingCard { // 부모노릇만 하겠다. 타입으로써 주소값을 담을 수 있다 ( 객체화는 안된다.
    //
    // interface : 추상메소드만 있다
    //           : 구현부가 없기에
    // interface는 public, static, final이여야 한다. 자동으로 컴파일러가 넣어준다
    public static final int SPADE = 4;
    final int DIAMOND = 3;
    static int HEART = 2;
    int CLOVER = 1;
    //
    // public abstract도 자동으로 컴파일러가 넣어준다
    // interface 는 abstract 만 있다.
    public abstract String getCardNumber();
    String getCardKind();
    //
}
//
interface PlayingChess extends PlayingCard{
    // 같은 인터페이스끼리 상속 받을려면 extends 이다.
    // 강제성은 필요가 없다 ( 구현부를 못 만드니 오버라이딩이 안된다.
    void moveHorse(int x, int y);

}
//
class Card implements PlayingCard{
    //
    // 인터페이스 는 자식클래스가 상속 받을려면 extends가 아니라 implements 이다.
    // implements : 구현부를 구현한다.
    @Override
    public String getCardNumber() {
        return null;
    }
    //
    @Override
    public String getCardKind() {
        return null;
    }
    //
}
//
class PlayingCardTest{
    public static void main(String[] args){
        System.out.println(PlayingCard.CLOVER);

    }
}

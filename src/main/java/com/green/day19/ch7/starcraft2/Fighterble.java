package com.green.day19.ch7.starcraft2;

public interface Fighterble extends Movebleo, Attackable{
    // interface 는 다중 상속이 가능하다.
    // 구현부가 없기에 다중 상속이 가능하다.
}
//
interface Movebleo {
    // public abstract가 생략
    void move(int x, int y);
}
//
interface Attackable {
    // public abstract가 생략
    void attack(Unit u);
}
//
class Unit{
    private int currenHp;
    private int x;
    private int y;
}
//
class Fighter implements Fighterble{
    // move, attack 오버라이딩의 강제성
    @Override
    public void move(int x, int y) {
        System.out.printf("%d, %d",x,y);
    }

    @Override
    public void attack(Unit u) {

    }
}
//
class FighterTest{
    public static void main(String[] args) {
    // 부모타입 | 객체 주소명 = 불러온 객체의 주소값
        Movebleo movebleo = new Fighter();
        movebleo.move(10, 20);
        //
        Fighter fighter = (Fighter)movebleo;
        fighter.attack(null);
        //
        Attackable attackable = (Attackable)movebleo;
        attackable.attack(null);
    }
}


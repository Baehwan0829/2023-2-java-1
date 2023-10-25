package com.green.day19.ch7.statcraft;


import java.util.ArrayList;
import java.util.List;


class StarcraftGame{
    public static void main(String[] args) {
        Unit unit = new Marine();
        Unit unit1 = new Tank();
        unit.move(10, 20);

        System.out.println("=====");
        unit1.move(50, 50);
        //
        List<Unit> units = new ArrayList();
        units.add(unit);
    }
}
//
class StarcraftGame2{
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        units.add(new Marine());
        units.add(new Marine());
        units.add(new Tank());
        units.add(new Tank());
        //
        moveAll(units, 30,50);

        Unit unit1 = units.get(units.size() - 1);

        System.out.println(unit1 instanceof Tank); // 인스턴스오프
        Tank tank = (Tank)unit1;
        tank.changeMode();
        //
    }
    //
    private static void moveAll(List<Unit> units, int x, int y) {
        for(int i=0; i<units.size(); i++){
            units.get(i).move(x,y);
            // get : 가져온다 불러온다
        }
        //
//        for(Unit unit : units){
//            unit.move(x, y);
//        }
    }
}
//
public abstract class Unit {
    //
    // private를 protected 변경 : 상속받은 클래스에서 직접 전역변수에 값에 접근하다.
    private int x;
    private int y;
    //
    public abstract void move(int x, int y);
    //
    public void stop(){
        System.out.println("현재 위치에 정지");
    }
    //
    // 생성자는 객체화 할 때 호출
    public void setX(int x){
        this.x = x;
    }
    //
    public void setY(int y){
        this.y = y;
    }
    //
}
//
class Marine extends Unit{
    //
    @Override
    public void move(int x, int y){
        // this.x = x;
        // super.x = x;
        // 부모 클래스에 전역변수 private이 있어서
        //
        this.setX(x);
        this.setY(y);
        System.out.printf("마린이 좌표 %d, %d로 이동\n", x, y);
    }
    public void steamPack(){
        System.out.println("스팀팩 시전!!!");
    }
}
//
class Tank extends Unit{
    private boolean siegeMode;
    @Override
    public void move(int x, int y){
        this.setX(x);
        this.setY(y);
        System.out.printf("시즈탱크가 좌표 %d, %d로 이동\n", x,y);
    }
    //
    public void changeMode(){
        this.siegeMode = !siegeMode;
        if( this.siegeMode ){
            System.out.println("시즈모드가 되었습니다.");
            return;
        }
        else {
            System.out.println("시즈모드가 풀렸습니다.");
        }
    }
    //
    public void changeMode2(){
        siegeMode = !siegeMode;
        System.out.println(siegeMode ? "시즈모드가 되었습니다." : "시즈모드가 풀렸습니다.");
    }
}
//

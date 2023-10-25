package com.green.day14.ch6;

public class Car2 {
    //
    String color;
    String gearType;
    int door;
    //
    // 생성자 생성
    public Car2(String c, String g, int d){
        color = c;
        gearType = g;
        door = d;
    }
    //
    public Car2(){

    }
    //
    public Car2(Car2 c1){
        // Car2
        this(c1.color,c1.gearType,c1.door);
        // 생성자, 같은 클래스의 다른 생성자를 호출 할 때 사용한다.
    }
    public void printMySelf(){
        System.out.printf("color : %s, gearType : %s, door : %d\n",
                color,gearType,door);
    }
}
//
class Car2Test{
    public static void main(String[] args) {
        //
        Car2 c1 = new Car2(); // 기본 생성자
        //
        c1.color = "Black";
        c1.gearType = "Manual";
        c1.door = 5;
        //
        Car2 c2 = new Car2(c1);
        //
        c1.printMySelf();
        c2.printMySelf();
    }
}

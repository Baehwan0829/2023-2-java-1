package com.green.day14.ch6;

import com.green.day6.ch4.While;

public class Car {
    //
    String color;
    String gearType;
    int door;
    //
    public Car(){
        // Car(String c, String g, int d) 호출
        // 클래스에 생성자가 하나도 없을 때 실행
        this("White","auto",4);
        // this("White"); 사용이 가능한 이유는 생성자를 호출하기 때문
    }
    //
    public Car(String c){
        this(c,"auto",4);
    }
    //
    public Car(String c, String g, int d){
        // Overloading Method
        // this.을 붙일 경우 타입변수명과 변수명이 서로 같을 때
        color = c;
        gearType = g;
        door = d;
    }
    //
    public void printMySelf(){
        System.out.printf("color : %s, gearType : %s, door : %d\n",
                color,gearType,door);
    }
}
//
class CarTest{
    //
    public static void main(String[] args) {
        Car car = new Car(); // 기본생성자가 주입
        // 클래스에 생성자가 하나도 없을 때 실행
        Car car1 = new Car("Blue"); // 생성자 호출
        // Car car1 : 객체의 주소값을 담는다.
        // 생성자가 없을 경우 붉은 줄이 뜬다.
        //
        car.printMySelf();
        car1.printMySelf();
    }
}

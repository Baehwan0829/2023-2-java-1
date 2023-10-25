package com.green.day15.ch7;

public class Parent extends Object{
    //
    // 객체 생성을 할 수 있으면 생성자
    // 기본 생성자
    // pulic Parent(){} 이 생략
    // 복사를 하는 개념이 아니라 참조를 하는 개념
    //
    int age; // 전역변수
    int num; // 프라모티브
    String a; // 인스턴스
    //
    public Parent(){ //

    }
    //
    public Parent(int age){
        this.age = age; // 자식클래스에 super() 를 쓸경우엔 !!
        // this
    }
    /*
        컴파일러에 기본생성자가 자동으로 들어간다.
        //
        public Parent(int a){
            super(); : 부모의 기본생성자 호출
            this.age = a;
        }
     */
}
//
//   ( 자식 )       ( 부모 )
class Child extends Parent{

    /*
     public Child(){ //   이 생략
        super(); // 매개변수값을 넣어주거나, 기본생성자를 만들어준다.
                 // 빨간 줄이 뜨면 기본생성자가 없기 떄문
                 // 바로 위에 부모의 주소를 참조한다.
        this.    // 나 자신의 주소를 참조
     }
     */
    //
    public Child(){
        super(1);
    }
    void play(){
        System.out.printf("%d살 꼬마야 놀자\n",age);
    }
}
//
class Child2 extends Parent{
    //
    public Child2(){
        super(10);
        // Method는 이미 생성이 끝났기에, Method내에서 사용할 수 없다.
        //
    }
    //
    void jump(){
        System.out.printf("%d살의 사람이 점프를 한다.\n", age);
    }
}
class Main{
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.age = 10;
        c1.play();
        //
        Parent p = c1; // 다양성
        //
        Child2 c2 = new Child2();
        c2.jump();
        //
        // 부모가 자식을 상속을 받을 수 없다.
        // 형제( c1, c2) 간에도 상속을 받을 수 없다.
    }
}

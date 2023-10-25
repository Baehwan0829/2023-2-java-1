package com.green.day16.ch7;

public class Animal {
    public void crying(){
        System.out.println("동물이 운다.");
    }
    //
}
//
class Dog extends Animal{
    //
    @Override
    public void crying(){ // 오버라이딩
        System.out.println("개 멍! 멍!");
       }
}
//
class Bulldog extends Dog{
    //
    public void jump(){
        System.out.println("불독 점프!!");
    }
    //
    public void crying(){
        System.out.println("불독 왈! 왈!");
    }
}
//
class Cat extends Animal{
    //
    @Override
    public void crying(){
        System.out.println("냐옹 냐옹");
    }

}
//
class AnimalText{
    public static void main(String[] args) {
        // 래퍼런스 관계에서 형 변형환이 가능한건 상속관계
        System.out.println("1.==========");
        // 1. 부모타입은 자식객체 주소값 담을 수 있음
        // 타입 | 객체 주소값 = 불러온 객체의 주소값
        Dog d1 = new Bulldog();
        Animal an1 = new Bulldog();
        Bulldog bull = (Bulldog) an1;
        Animal an2 = new Dog();
        Animal an3 = new Cat();
        //
        System.out.println("2.==========");
        // 2. 자식타입은 부모객체 주소값을 담을 수 없다.
        Dog d2 = new Dog();
        Bulldog bull2 = (Bulldog)d2;
        //
        System.out.println("3.==========");
        // 3. 타입은 알고 있는 메소드만 호출할 수 있고,
        //    호출이 된다면 객체 기준이다.
        // 호출되는 객체 기준부터 제일 먼저 만나는 메소드
        // 타입 | 은 알고있는것만 호출
        Bulldog b2 = new Bulldog();
        b2.crying(); // 실행하면 crying이 실행
        System.out.println("4.==========");
        //
        Dog d3 = new Bulldog();
        d3.crying();
    }
}
class AnimalTest2{
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bulldog bulldog = new Bulldog();
        // Cat cat1 = (Cat)ani; 에러가 터진다.
        //
        callCrying(dog);
        System.out.println("====");
        callCrying(cat);
        System.out.println("====");
        callCrying(bulldog);
        System.out.println("====");
    }
    //
    private static void callCrying(Animal ani){

        ani.crying();
        //
        System.out.println(ani instanceof Bulldog);
        if(ani instanceof Bulldog){ // if, while문 안에 쓸 수 있는거 ( boolean )
            // ani instanceof Dog // true
            // 에러가 안뜨면 상속관계다
            // 왼쪽 변수or상수 , 형 변환 할 class명, 둘은 상속관계여야한다.
            Bulldog bulldog = (Bulldog) ani;
            // ani 라는 큰 개념을 ( Bulldog ) 이란 작은 개념으로 형변환
            // 형 변환 값을 Bulldog이란 Type의 bulldog의 객체에 담는다.
            bulldog.jump();
        }
    }
    /*
    private static void callCrying(Dog dog){
        dog.crying();
    }
    private static void callCrying(Cat cat){
        cat.crying();
    }
    private static void callCrying(Bulldog bulldog){
        bulldog.crying();
    }
     */
}
//
class AnimalTest3{
    public static void main(String[] args) {
        //
        Animal ani = new Cat();
        System.out.println(ani instanceof Dog); // false
        // boolean Type
        //
        // Dog dog = (Dog) ani;
        System.out.println(ani instanceof Cat); // true
        Cat cat = (Cat)ani;
        System.out.println("끝");
    }
}
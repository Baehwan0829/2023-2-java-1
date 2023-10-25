package com.green.day19.ch7;

public class AnonymousClassTest {
    public static void main(String[] args) {
        // 익명클래스는 안드로이드 개발에 많이 쓴다.
        Runnable2 run = new RunRobot();
        Runnable2 run2 = new Runnable2() {
            // 만들때마다 이름이 달라질 경우 익명클래스
            // 인터페이스 , 인터페이스
            @Override
            public void run() {
                System.out.println("하하하");
            }
        };
        //
        BasicRobot br = new BasicRobot(){
          @Override
          public void run(){
              System.out.println("익명 로봇이 뛴다.");
          }
        };
    }
}
//
interface Runnable2{ // 부모의 역할만 하겠다.
    // public abstract 앞에 생략
    public abstract void run();
}
//
class RunRobot implements Runnable2{
    @Override
    public void run(){
        System.out.println("로봇이 달린다.");
    }
} // 이름이 있는 클래스
//
class BasicRobot{
    public void run(){
        System.out.println("로봇이 뛴다.");
    }
}
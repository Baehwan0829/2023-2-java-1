package com.green.day13.ch6;

public class MyMath2 {
    //
    // 인스턴스 변수
    // 객체화를 생성한 후 인스턴스 변수를 참조가능
    // 인스턴스 메소드에서는 인스턴스메소드, static메소드
    // 모두 인스턴스 생성없이 바로 호출 가능하다.
    //
    int num;
    //
    // static 은 이름을 다르게 설정해도 공간이 하나다.
    // ( 클래스 이름으로 접근한다. )
    // ( 객체화를 할 필요가 없다, 메모리에 바로 올라간다. )
    // static 메소드에서 인스턴스 변수를 사용할 수 없다.
    //
    public static int stNum;
    //
    // 이런 경우는 Static이 불가
    void instanceAbs(){
        System.out.println(num < 0 ? -num : num);
    }
    //
    // 이런 경우는 Static이 가능
    public static void staticAbs(int n){
        System.out.println(0 > n ? -n : n);
    }
    //
    // 클래스명, this가 생략되어 있다.
    static void print(){
        System.out.printf("static : %d\n", stNum);
    }
    //
    void print2(){
        System.out.printf("static : %d\n", stNum);
    }
    //

}

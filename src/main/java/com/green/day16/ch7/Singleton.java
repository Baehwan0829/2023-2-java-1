package com.green.day16.ch7;

public class Singleton {
    //
    int num = 0;
    static int num2 = 0;
    // private이 있으니 기본생성자를 미리 만들어놓고
    private Singleton(){}
    // static을 후에 사용한다.
    // static 메모리 먼저 올라간다.
    // 객체화 필요없고, 공간은 하나
    //
    // 인스턴스 변수 메소드만 안 쓰면 static을 쓸 수 있다.
    // 단, 객체화 후 사용 가능
    // static 변수도 사용이 가능함.
    private static Singleton singleton; // 사용할려면 static 을 붙인다.
    //
    //
    public static Singleton getInstance(){
        //
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    //
    public static Singleton unzen(){
        //
        Singleton max = null;
        singleton = max;
        return singleton;
    }
}
class SingletonTest{
    public static void main(String[] args) {
        // 래퍼런스타입 ( == ) . 동일성비교
        Singleton s1 = Singleton.getInstance();
        // 재귀호출, static Method ( 대문자로 시작하기 때문 )
        System.out.println(s1);
        Singleton s2 = Singleton.getInstance();
        System.out.println(s2);
        System.out.println(s1 == s2);
        //
        Singleton ur = Singleton.unzen();
        System.out.println(ur);
    }
}

package com.green.day14.ch6;

public class Data1 {
    //
    // 생성자가 존재 이유 : 객체생성할 때 무조건 있어야한다.
    //                 : 객체생성과 동시에 멤버필드를 사용할 때
    //
    // 생성자의 이름은 클래스 이름과 같아야한다.
    // 생성자는 리턴 값이 없다.
    // 클래스에 정의된 생성자가 하나도 없을 때 뿐
    //
    int value;
    int value2;
    int value3;
    //
    public Data1(){ // 기본생성자 ( default constructor )
        // System.out.println("ConstructorTest - Data1");
        // this. : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
        // this() : 생성자, 같은 클래스의 다른 생성자를 호출 할 때 사용한다.
        //
        this(100,200,300);
        // 객체를 생성할 때만 생성
        // 메소드에서 호출할 수 없다.
    }
    //
    public Data1(int a){ // 파라미터 생성자
        value = a;
    }
    //
    public Data1(int a, int b, int c){
        value = a;
        value2 = b;
        value3 = c;
    }
    //
    public void printMySelf(){
        System.out.printf("value : %d, value2 : %d, value3 : %d\n",
                value,value2,value3);
    }
}
//
class ConstructorTest{
    public static void main(String[] args) {
        Data1 data = new Data1(); // 기본생성자 ( default constructor )
        data.printMySelf();
         //
        Data1 data2 = new Data1(10,20,30);
        data2.printMySelf();
    }
}

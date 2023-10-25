package com.green.day11.ch6;

public class DiffPriRef {
    /*
      객체지향은 오버로딩이 된다
     : 한 클래스 내의 같은 이름의 method를 여러 개 정의하는 것
      1. method 이름이 같아야 한다.
      2. 매개변수의 개수 or 타입이 달라야 한다.
    */
    public static void main(String[] args){
        //
        int num = 30;
        changeVal(num); // 3
        System.out.println("num : " + num); //
        //
        //
        // 주소값을 알면 접근할 수 있다.
        //
        NumBox nb = new NumBox();
        System.out.println("1. nb.num : " + nb.num); // 객체에 있는 값을 유추 할 수 있다.
        nb.num = 30;
        System.out.println("2. nb.num : " + nb.num); // 30을 복사하여 준다/
        changeVal(nb);
        //
        // changeVal의 메소드명와 매개변수타입이 서로 같은 곳에 찾아간다.
        System.out.println("3. nb.num : " + nb.num);
        //
        //
    }
    //
    // 똑같은 이름의 메소드를 만들 수 있다 : 오버로딩 ( OverLoading )
    //
    public static void changeVal(int num){ // 여기에 값을 바꿔도 3번에 값을 안 변한다.
        System.out.println("changeVal - int");
        num = 10;
    }
    //
    //
    public static void changeVal(NumBox nb) {
        /*
         변수명은 상관없이 가지고 있는 값이 중요하고
         사용하게 될 경우 그 변수명을 사용해야한다.
         //
         래퍼런스변수 ; 참조형 매개변수
         값은 주소값을 가지고 있지만 다른 개체
         기존에 있는 값을 지우고 10을 대입한다
        */
        //
        System.out.println("changeVal - NumBox");

        nb.num = 3; // 새로운 주소값을 생성
    }
}
//
//
class NumBox{
    int num;
}
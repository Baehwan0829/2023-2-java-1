package com.green.day18.ch7;

import com.green.day12.ch6.Card;
import java.util.*;

public class ArrayListTest {
    public static void main(String[] args){
        // 들어갈 때 Object, 나올 때도 Object
        List list = new ArrayList(); // 상속관계, Type이 다르다.
        // List 부모 = 다향성을 이용
        // LinkedList 를 이용할 때도 List타입 사용가능
        list.add(10);
        list.add(10.3f);
        list.add(10.4d);
        list.add(13l);
        list.add("ddd");
        list.add(new Card());
        //
        Object val = list.get(0);
        int intVal1 = (int)val;
        float floatVal2 = (float)list.get(1);
        //
        Object obj = 10;
        obj = 10.3f;
        obj = 10.3d;
        obj = 103l;
        obj = "ddd";
        obj = new Card();
    }
}
//
class ArrayListTest2{
    public static void main(String[] args){
        //
        int v1 = 10;
        Integer v2 = 10; // Integet 래퍼타입
        // List< 래퍼타입만 들어갈 수 있음 > list = new ArrayList(); // p.490
        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(70);
        // 값 넣기, add Method, 리턴타입 boolean
        int val1 = list.get(0); // 값 빼기,
        System.out.println(list.get(1));
        System.out.printf("size : %d\n",list.get(1));
        //
        for(int i=0; i<list.size(); i++){
            System.out.printf("[%d] : %d\n",i,list.get(i));
        }
        //
        for(int val : list){
            System.out.println(val);
        }
    }
}
//
class ArrayListTest3{
    public static void main(String[] args) {
        //
        List<Integer> list = new ArrayList<>();
        // ArrayList의 주소값을 담을 수 있다.
        // 이유 : toString가 오버라이딩
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //
        System.out.println("1 : " + list);
        list.add(1,100);
        // 앞에 숫자 방 번호, 뒷 숫자가 삽입할 숫자, 기존에 있던 숫자는 뒤로 밀어낸다.
        System.out.println("2 : " + list);
        list.add(3,200);
        System.out.println("3 : " + list);
        //
        list.remove(1);
        System.out.println("4 : " + list + " size : "+ list.size());
    }
}
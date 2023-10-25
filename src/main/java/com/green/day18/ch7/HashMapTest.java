package com.green.day18.ch7;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest {
    public static void main(String[] args){
        Map map = new HashMap(); // 순서 x , <Integer> 제네릭
        // 값을 넣을 떈 put
        map.put("a",10); // 왼쪽 key & 오른쪽 val 로 이루어진 컬렉션
        map.put("b",20);
        //
        Object obj = map.get("a");
        int val = (int)obj;
        System.out.println("val : " + val);
    }
}
//
class HashMapTest2{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //래퍼타입에 <String, Integet> 를 지정해주면 그 타입으로만 해야한다.
        map.put("Tv", 0);
        map.put("Computer", 0);
        map.put("Audio",0);
        //
        map.put("Tv", map.get("Tv") + 1);
        //
        System.out.println("Tv-count : " + map.get("Tv"));
        System.out.println("Size : " + map.size());
    }
}
//



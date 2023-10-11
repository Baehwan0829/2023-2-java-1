package com.green.day7.ch5;

public class Array3 {
    public static void main(String[] args) {
        int[] arr1 = {5, 10, 15, 20};
        int[] arr2 = new int[arr1.length]; // 이 방에는 0이 세팅
        // int[] arr2 = new int[arr.length]의 방 갯수
        //
        // Deep copy
        //
        for (int i=0; i<arr1.length ; i++) {
            arr2[i] = arr1[i]; // arr1 주소 값을 arr2로 복사하는 것
            System.out.println(arr2[i]);
        }
        //
        // 동등성 : equals 비교, Shallow copy는 동등성, 동일성 둘 다 True
        // 동일성 : == 비교 ,    Deep copy는 동등성 True, 동일성 false
        // shallow copy : 얕은 복사 = 8Byte
        // Deep copy : 깊은 복사 = ( 주소1과 같은 방은 개수를 똑같이 만들어 복사한다. )
        //
        arr2[1] = 200;
        System.out.println("----arr1");
        for(int i=0; i<arr2.length; i++){
            System.out.printf("arr1[%d] : %d\n", i, arr1[i]);
        }
        System.out.println("----arr2");
        for(int i=0; i<arr2.length; i++){
            System.out.printf("arr2[%d] : %d\n", i, arr2[i]);
        }
    }
}

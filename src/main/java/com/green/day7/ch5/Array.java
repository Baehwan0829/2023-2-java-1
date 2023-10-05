package com.green.day7.ch5;

public class Array {
    public static void main(String[] args){
        //
        // index는 0번부터 시작
        int n1 = 10, n2=20, n3=30; // 변수엔 값을 1개만 저장
        int[] arr = {10,20,30}; // 배열에 접근할 수 있는 주소값을 저장
        String[] arr2 = {"A", "B", "가", "나",};
        double[] arr3 = {-1,-2,-3};

        int[] arr4 = new int[3]; // java에서는 이것만 사용한다.

        arr[0] = 200;

        // int
        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);
        // String
        System.out.println("arr2[0] : " + arr2[0]);
        System.out.println("arr2[1] : " + arr2[1]);
        System.out.println("arr2[2] : " + arr2[2]);
        // double
        System.out.println("arr3[0] : " + arr3[0]);
        System.out.println("arr3[1] : " + arr3[1]);
        System.out.println("arr3[2] : " + arr3[2]);
        // int[]
        System.out.println("arr4[0] : " + arr4[0]);
        System.out.println("arr4[1] : " + arr4[1]);
        System.out.println("arr4[2] : " + arr4[2]);
        //
        System.out.println("arr.length : " + arr.length); // 배열 주소값 갯수 읽기
    }
}

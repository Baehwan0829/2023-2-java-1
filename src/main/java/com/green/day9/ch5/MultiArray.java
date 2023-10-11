package com.green.day9.ch5;

public class MultiArray {
    public static void main(String[] args){
        int[][] arr = { // [] [] 은 첫은 행 뒷에가 열
                {100, 200}, // 0번방
                {300, 400}, // 1번방
                {500, 600}  // 2번방
        };
        //
        System.out.print(arr[0][0]); // 100
        System.out.println(arr[0][1]); // 200
        System.out.print(arr[1][0]); // 300
        System.out.println(arr[1][1]); // 400
        System.out.print(arr[2][0]); // 500
        System.out.println(arr[2][1]); // 600
        //
        System.out.println("===========");
        int[] intArr = arr[1];
        System.out.println(intArr[1]);
        //
        System.out.println("===========");
        System.out.println("arr.length : " + arr.length);
        System.out.println("arr[0].length : " + arr[0].length);
    }
}

package com.green.day7.ch5;

public class ArrayMission {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500};
        //
        int[] arr2 ={100,200,300};
        arr = arr2;
        for(int i=0; i<arr.length; i++){
            System.out.println("arr : " + arr[i]);
        }
    }
}

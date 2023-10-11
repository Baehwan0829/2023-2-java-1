package com.green.mynote.month10.java1006;

public class Array {
    public static void main(String[] args){
        int[] arr = new int[3];
        int[] arr2 = new int[arr.length*2]; //
        //
        String a = "0";
        int i=0;
        /*
        for( i=0; i<arr.length; i++){ //
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
        }
        */
        arr2[arr.length] = 50;
        for( i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }
}

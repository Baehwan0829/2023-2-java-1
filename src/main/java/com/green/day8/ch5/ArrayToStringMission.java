package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = {5,10,7,3,11};
        System.out.println(Arrays.toString(arr));
        int commlen = arr.length - 1;
        //
        System.out.println("===========================if문");
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
          if(i < commlen) {
              System.out.printf("%d,",arr[i]);
          }
          else{
              System.out.printf("%d\n" , arr[i]);
          }
        }
        System.out.print("]");
        System.out.println("=======================print출력문 ");
        //
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i < commlen) {
                System.out.print(arr[i] + ", ");
            }
            else{
                System.out.printf("%d\n" , arr[i]);
            }
        }
        System.out.print("]");
        System.out.println("==========================삼항식");
        //
        System.out.print("[");
        for(int i=0; i<arr.length; i++){
            if(i < commlen) {
                System.out.print(i < commlen ? arr[i] + ", " : arr[i]);
            }
        }
        System.out.print("]");
    }
}

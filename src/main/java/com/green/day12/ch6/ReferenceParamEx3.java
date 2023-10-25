package com.green.day12.ch6;

import java.util.Arrays;

public class ReferenceParamEx3 {
    public static void main(String[] args) {
        //
        int[] arr = { 3, 2, 1, 6, 5, 4, 8, 7, 9};
        //
        printArr(arr);
        System.out.println("7 : " + Arrays.toString(arr));
        //
        System.out.println("1 : " + Arrays.toString(arr));
        //
        sorArr(arr);
        System.out.println("3 : " + Arrays.toString(arr));
        //
        sorArr2(arr);
        System.out.println("5 : " + Arrays.toString(arr));
        //
        sumArr(arr);
        System.out.println("8 : sum 값 " + sumArr(arr));
    }
    //
    public static void sorArr(int[] ar) {
       for(int i=0; i<ar.length; i++){ // ar[] 주소크기만큼의 범위를 정한다.
           for(int j=0; j < i; j++){ // 0 ~ 5 비교 , 증가한다.
               if(ar[i] < ar[j]) {   // 조건 ar[i]값이 < ar[j] 작아질 때 까지
                   int t = ar[i];    // ar[i]값을 t에 대입
                   ar[i] = ar[j];    // ar[j]값을 ar[i]에 대입
                   ar[j] = t;        // t 값을 ar[i]에 대입
               }
           }
       }
        System.out.println("2 : " + Arrays.toString(ar));
    }
    //
    // 강사님 코드
    public static void sorArr2(int[] ar) {
        for(int i=ar.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                int nI = j + 1;
                if(ar[j] > ar[nI]) { // ar[j]값과 ar[nI]값을 서로 비교
                    int t = ar[j];
                    ar[j] = ar[nI];
                    ar[nI] = t;
                }
            }
        }
        System.out.println("4 : " + Arrays.toString(ar));
    }
    //
    //
    public static void printArr(int[] ar){
        //
        /*
        System.out.printf("6 : [");
        for(int i=0; i<ar.length-1; i++){
            System.out.printf("%d, ", ar[i]);
        }
        System.out.printf("%d   ]\n",ar[ar.length-1]);
        */
        //
        // 강사님 코드
        System.out.printf("6 : [%d", ar[0]);
        for(int i=1; i<ar.length; i++){
            System.out.printf(", %d",ar[i]);
        }
        System.out.println("]");
    }
    //
    //
    public static int sumArr(int[] ar){
        int sum = 0;
        for(int i : ar){ // 비교해줄 값이 항상 오른쪽
            sum += i;
        }
        return sum;
    }
}

package com.green.day12.ch6;

import java.util.Arrays;

public class MethodExam4 {
    //
    //
    // 원본을 건드리지 않고 새로운거 출력한다 : 비파괴
    // 원본을 수정하고 새로운거 출력한다 : 파괴
    //
    // deep copy
    int[] plusMap(int[] n1, int n2){
        int[] rArr1 = new int[n1.length];
        for(int i=0; i<n1.length; i++){
            rArr1[i] = n1[i] + n2;
            // rArr[i] += n2;
        }
        return rArr1; // 리턴한 값은 보내고 사라진다.
    }
    //
    // shallow copy
    int[] plusOrigin(int[] n, int n1){
        for(int i=0; i<n.length; i++) {
            n[i] += n1;
        }
        return n;
    }
    //
    // deep copy응용
    int[] randomValFromTo(int n, int n1, int n2){
        int[] arr = new int [n];
        for(int i=0; i<arr.length; i++){
            int n3 = (int)(Math.random() * (n2-n1+1)) + n1;
            arr[i] += n3;
        }
        return arr;
    }
    //
    //
    public static void main(String[] args) {
        //
        //
        MethodExam4 me4 = new MethodExam4();
        int[] arr = {10,20,30};
        int[] rArr1 = me4.plusMap(arr,2);
        System.out.println("===deep copy===");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(rArr1));
        //
        //
        System.out.println("===shallow copy===");
        me4.plusOrigin(arr, 4);
        System.out.println(Arrays.toString(arr));
        //
        //
        System.out.println("=================");
        // 배열크기 최솟 2 최댓 20
        int[] arr2 = me4.randomValFromTo(10,5,20);
        System.out.println(Arrays.toString(arr2));
    }
}

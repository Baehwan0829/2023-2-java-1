package com.green.day18.ch7;

public class MyArrayList {
    //
    private int[] arr;
    //
    public MyArrayList(){
        arr = new int[0];
    }
    //
    public void add(int a){
        int[] arrval = new int[arr.length + 1]; // 이때 렝스의 개수는 1
        for(int i=0; i<arr.length; i++){ // 여기서는 0
            arrval[i] = arr[i];
        }
        arrval[arr.length] = a; // 추가된 렝스의 n번방 값을 int a을 대입한다.
        arr = arrval; // arr에 복사하여 값을 준다.
    }
    //
    public void add(int a, int n){
        int[] arrVal = new int[arr.length + 1];
        arrVal[a] = n;
        for(int i=0; i<a; i++){
            arrVal[i] = arr[i];
        }
        for(int i=a; i<arr.length; i++){
            arrVal[i+1] = arr[i];
        }
        arr = arrVal;
    }
    //
    public void add2(int idx, int val){
        int[] arrVal = new int[arr.length + 1];
        arrVal[idx] = val;
        for(int i=0; i<arr.length; i++){
            arrVal[i < idx ? i : i+1] = arr[i];
        }
        arr = arrVal;
    }
    //
    public String toString(){
        String tmp = "[";
        if(arr.length > 0){
            tmp += arr[0]; // 10
            for(int i=1; i < arr.length; i++){
                tmp += ", " + arr[i]; // , 20, 30, 40, ....
            }
        }
        tmp += "]";
        return tmp;
    }
}
//
class MyArrayListTest{
    public static void main(String[] args){
        MyArrayList myal = new MyArrayList();
        myal.add(10);
        myal.add(20);
        myal.add(30);
        myal.add(40);
        System.out.println(myal);
        myal.add(1,40);
        System.out.println(myal);
        myal.add2(2,30);
        System.out.println(myal);
    }
}

package com.green.day2.ch2;

public class OverflowEx {
    public static void main(String[] args){
        //
        int intVal = 128;
        byte byteVal = (byte)intVal; // Type이 다르니 형 변환
        System.out.printf("byteVal : %d\n", byteVal);

        int intVal2 = 128;
        byte byteVal2 = (byte)intVal2; // 오버플로우 OverFlow
        System.out.printf("byteVal2 : %d\n", byteVal2);

        int intVal3 = -129;
        byte byteVal3 = (byte)intVal3; // 언더플로우 UnderFlow
        System.out.printf("byteVal3 : %d\n", byteVal3);
    }
}

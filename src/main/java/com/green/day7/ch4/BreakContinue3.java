package com.green.day7.ch4;

public class BreakContinue3 {
    public static void main(String[] args){
        hu:
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                  break hu;
                }
                System.out.printf("i:%d - j:%d\n", i, j);
            }
        }
        System.out.println("--------------------");
        ten:
        for (int i = 0; i < 5; i++) {

            for (int j = 10; j < 15; j++) {
                if (j == 13) {
                    continue ten;
                }
                System.out.printf("i:%d - j:%d\n", i, j);
            }
        }
    }
}

package com.green.day12.ch6;

public class GugudanTest {
    //
    public static void main(String[] args) {
        //
        System.out.println("====GuGuDan====");
        Gugudan ggd = new Gugudan();
        ggd.print(4);
        //
        System.out.println("====GuGuDan.Multi====");
        ggd.printFromTo(4, 7);
        //
        System.out.println("====GuGuDan.PrintLn====");
        ggd.printFromTo(3,6, "-----");
    }
}

package com.green.day11.ch6;

public class StarPrint {
    //
    // StarPrint
    void line(int n){
        for(int i=0; i<n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //
    // Suting
    String Suting(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        return "";
    }
    //
    // Square
    void square(int n){
        for(int z=0; z<n; z++) {
            line(n);
        }
    }
    //
    // Triangle
    void triangle(int n){
        for(int i=1; i<=n; i++){
            line(i);
        }
    }
    //
    // gender
    String chkGenderById(String n){
        char g = n.charAt(7);
        switch (g){
            case '1','3':
                return "남성";
            case '2','4':
                return "여성";
        }
        return "";
    }
    //
    // MIN ~ + ~ MAX
    int sumFromTo(int n1, int n2){
        int sum = 0;
        for(int i=n1; i<=n2; i++){
            sum += i;
        }
        return sum;
    }
}
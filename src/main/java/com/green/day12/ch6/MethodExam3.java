package com.green.day12.ch6;

public class MethodExam3 {
    //
    int sumText(String str){
        int a = Integer.parseInt(str);
        int sum = 0;
        for (int i = 0; i<str.length(); i++) {
            int n = str.charAt(i) - '0'; // 문자열에서 빠져나온다
            sum += n;
        }
        return sum;
    }
    //
    //
    int sumText1(String str){
        int sum = 0;
        int a = Integer.parseInt(str);
        for (int i = 0; i<str.length(); i++) {
            sum += a % 10; // 나머지를 뽑아서 더한다.
            a = a/10; // 했던 숫자를 제외한다
        }
        return sum;
    }
    //
    //
    int sumText2(String str){
   //  리턴타입  메소드명
        char[] charArr = str.toCharArray();
        int sum = 0;
        for(char ch : charArr){
            sum += Character.getNumericValue(ch); // 중첩문에 넣어준다
        }
        return sum;
    }
    //
    //
    public static void main(String[] args) {
        //
    //  (  래퍼런스  )  =
        MethodExam3 str = new MethodExam3();
        //
        int s1 = str.sumText1("123123");
        //
        System.out.println(s1);
        System.out.println("sum :  " + str.sumText1("111"));
        //
        //
        System.out.println("=======================");
        String test = "9871231";
        String test2 = "8271691";
        System.out.println(str.sumText(test)); // 호출문만 있었야 한다.
        System.out.println(str.sumText2(test2));
        //
        //
    }
}

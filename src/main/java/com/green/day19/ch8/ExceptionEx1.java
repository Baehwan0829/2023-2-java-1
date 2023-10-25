package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {
        //
        int num = 0;
        num /= 0;
        //
        try{
            num = 10;
        }
        //
        catch (Exception e){ // try에서 예외가 발생되면 catch가 실행된다.
                             // Exception이 가리킬 수 있는 객체의 주소값을 e에 담는다.
            e.printStackTrace(); // 무슨 오류가 발생했는지 알 수 있다.
            System.out.println("예외 발생");
            num = -1;
        }
        finally { // 유/무는 따지지 않고 / 예외 발생여부 상관없이 반드시 실행됨
            System.out.println("finally 실행!!!");
        }
        System.out.printf("num : %d\n",num);
        System.out.println("---끝---");
    }
}
//
class ExceptionEx1_2{
    //
    public static void main(String[] args){
        div(10);
    }
    //
    public static void div(int num){
        //
        try{
            num = 10;
            return; // finally로 빠져나간다는 의미
            //
        }
        //
        catch (Exception e){
            e.printStackTrace();
            System.out.println("예외 발생");
            num = -1;
        }
        //
        finally {
            num *= 20;
            System.out.println("finally 실행!!!");
            System.out.printf("num : %d\n",num);
        }
        //
    }
}
//
class ExceptionEx1_3{
    //
    public void sum(){}
    //
    public static void main(String[] args){
        //
        try {
            // int num = 10/0;

            ExceptionEx1_3 obj = null;
            obj.sum();

            // int[] arr = new int[10];
            // arr[10] = 10;
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("수학적 예외");
        }
        catch (NullPointerException e){
            System.out.println("널포인트 예외");
        }
        catch (Exception e){
            System.out.println("모든 예외");
        }
        System.out.println("끝!!!");
    }
}

package com.green.day16.ch7;

public class Time {
    //
    // Time 객체가 많이 만들어질때 static을 붙여준다
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;
    private int hour, minute, second;
    //
    // private 한 전역변수에 값을 넣는 방법
    // 1. 생성자를 통해
    // 2. 메소드를 통해
    //
    // 컴파일러가 기본생성자를 뺐구나라 생각한다.
    //
    // 1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //
    //
    // 2. setter 메소드 : private의 값을 변경하기 위해
    // 보낼 값이 없기에 void Type, 파라미터만 같은 type을 넣어준다
    // 잘못된 값이 들어가지 않도록 로직을 구현
    public void setHour(final int hour) {
        if(hour > MAX_HOUR){
            this.hour = MAX_HOUR; return;
        }
        else if(hour < MIN_HOUR){
            this.hour = MIN_HOUR; return;
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    //
    public void setSecond(int second) { //
        this.second = second;
    }

    //
    // 메소드를 통해서 값을 빼낸다.
    // 3. Getter 메소드 : 파라미터를 줄 필요가 없다. 외부에서 받을 정보가 없음
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    //
    public String toString(){
        //  return "시 :" + hour + " 분 : " + minute + " 초 : " + second;
        return String.format("%02d : %02d : %02d", hour,minute,second);
        // static Method
        // String strHour = String.valueOf(hour <10  ? "0" + hour : hour );
        // return strHour;
    }
    //
}

class TimeTest{
    public static void main(String[] args) {
        Time time = new Time(13,01,50); // 기본생성자가 없거나, 매개변수를 안 넣어서
        time.setHour(2);
        time.setMinute(30);
        time.setSecond(1);
        System.out.println(time);
        System.out.println("===============");
        //
        System.out.println(time);
    }
}

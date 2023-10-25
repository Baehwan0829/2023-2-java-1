package com.green.day16.ch7;

import com.green.day15.ch7.*;
//  *를  붙일 경우 : 와일드 카드
import com.green.day15.ch7.Parent;
import com.green.day13.ch6.MyMath2;
// 클래스 명을 안 붙일경우
import static com.green.day13.ch6.MyMath2.staticAbs;
// 다른 패키지이지만, 메소드 or 전역변수를 같은 클래스에 있는 것처럼 쓸 수 있다.
import static com.green.day13.ch6.MyMath2.stNum;

public class PackageTest {
    public static void main(String[] args) {
        //

        Parent parent;
        MyMath2.staticAbs(10);
        // 클래스 명을 안 붙일경우
        staticAbs(10);
        stNum = 10;
    }
}
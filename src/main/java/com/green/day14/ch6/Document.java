package com.green.day14.ch6;

public class Document {
    //
    String name;
    static int num;
    // static을 뺄 경우 num값은 0이 출력된다.
    //
    {
        num++; // 인스턴스 초기화 블럭
    }
    //
    public Document(){ // 파라미터가 없는 생성자 : 기본생성자
        super(); // 부모생성자 호출 ( 상속 )을 받는다.
        System.out.printf("문서 제목없음%d가 생성됨\n", num);
        //
        // this(String.format("제목없음%d", num));

    }
    //
    public Document(String n){
        this.name = n;
        //
        System.out.printf("문서 %s가 생성됨\n", this.name);
    }
    //
}
//
class DocumentTest{
    //
    public static void main(String[] args) {
        //
        Document d = new Document(); // 문서 제목없음1가 생성됨
        Document d2 = new Document("자바.txt"); // 문서 자바.txt가 생성됨
        Document d3 = new Document(); // 문서 제목없음2가 생성됨
        Document d4 = new Document();
    }
}

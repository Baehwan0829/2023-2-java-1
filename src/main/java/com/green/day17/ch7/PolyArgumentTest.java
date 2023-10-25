package com.green.day17.ch7;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        int price = c.getPrice();
        int bonus = c.getBonusPoint();
        //
        Tv t = new Tv();
        int tvprice = t.getPrice();
        int tvbonus = t.getBonusPoint();
    }
}

class PolyArgumentTest2{
    public static void main(String[] args) {
        Buyer buyer =  new Buyer();
        System.out.println(buyer);
        //
        buyer.buy(new Tv());
        buyer.buy(new Computer());
        System.out.println(buyer);
        //
    }
}
//
class   Buyer{
    //
    private int money;
    private int bonusPoint;
    //
    public Buyer(){
        this.money = 1050;
        this.bonusPoint = 0;
    }
    public String toString(){
        return String.format("money : %d, bonusPoint : %d", money, bonusPoint);
    }
    //
    public void buy(Produt produt){
//        System.out.println(produt);
//        System.out.println(produt.getPrice());
//        System.out.println(produt.getBonusPoint());
        //
        if( money < produt.getPrice()) {
            System.out.println(" 잔액이 부족합니다 ");
            return;
        }
        //
        if( money > produt.getPrice()) {
            money -= produt.getPrice();
            bonusPoint += produt.getBonusPoint();
            System.out.println("==========");
            System.out.println( produt + "를 구매하셨습니다 ");
        }
        //
    }
    //
}
//
//    public void buy(Tv tv){
//        int buy = tv.getPrice();
//        //
//        System.out.println(tv.getPrice());
//        System.out.println(tv.getBonusPoint());
//    }
//    //
//    public void buy(Computer com) {
//        int buy = com.getPrice();
//        //
//        System.out.println(com.getPrice());
//        System.out.println(com.getBonusPoint());
//    }
class Produt    {
    //
    private int price;
    private int bonusPoint;
    //
    protected Produt(int price){
        this.price = price;
        this.bonusPoint = price / 10;
    }
    //
    public int getPrice(){
        return price;
    }
    public int getBonusPoint() {
        return bonusPoint;
    }
    //
    public String toString(){
        return String.format("price : %d, bonusPoint : %d",price,bonusPoint);
    }
}
//
class Tv extends Produt{
    // 기본 생성자를 만들어주거나 or 가지고 있는 생성자를 호출한다.
    public Tv(){
        super(100);
    } // 부모의 기본 생성자 호출
    //
    public String toString(){
       return "Tv " /* + super.toString()*/ ;
    }
    //

}
//
class Computer extends Produt{
    //
    public Computer(){
        super(200);
    }
    //
    public String toString(){
        return "Computer " /* + super.toString() */;
    }
    //
}
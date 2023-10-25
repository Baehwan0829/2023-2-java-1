package com.green.day17.ch7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class PolyArgumentTestVer2 {
    public static void main(String[] args) {
        Product2 p2 = new Product2("PC",1000);
        System.out.println(p2);
        //
        p2.getName();
        p2.getPrice();
        p2.getBonusPoint();
    }
}
//
class PolyArgumentTestVer2_3{
    //
    public static void main(String[] args){
        Buyer2 buy = new Buyer2();
        buy.buy(new Tv2());
        buy.buy(new Tv2());
        buy.buy(new Tv2());
        buy.buy(new Computer2());
        buy.buy(new Computer2());
        buy.buy(new Auido2());
        buy.buy(new Auido2());
        //
        buy.summary();
    }
    //
}
//
class PolyArgumentTestVer2_4{
    public static void main(String[] args) {
        Buyer3 buyer3 = new Buyer3();
        buyer3.buy(new Computer2());
        buyer3.buy(new Computer2());
        buyer3.buy(new Computer2());
        buyer3.summary();
    }
}
//
class Buyer2{
    //
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i = 0;
    private int sum = 0;
    //
    public Buyer2(){
       this.money = 1500;
       this.bonusPoint = 0;
       productArr = new Product2[10];
    }
    //
    public void buy(Product2 product2){
        //
        if (money == product2.getPrice()) {
            System.out.println("물품거래 가능이 초과 혹은 잔액이 부족");
            return;
        }
        else if (money < product2.getPrice()){
            money -= product2.getPrice();
            System.out.printf("%s를 샀습니다 잔액 : %d\n", product2.getName(), money);
            bonusPoint += product2.getBonusPoint();
        }
        sum += product2.getPrice();;
        this.productArr[i++] = product2;
        System.out.printf("[%s] [%d] [%d]\n", product2.getName(), money, bonusPoint);
    }
    //
    public void summary(){
        //
        System.out.printf("구입하신 총 금액 : %d만원입니다.\n", sum);
    }
}
//
class Buyer3{
    //
    private int money;
    private int bonusPoint;
    private Product2[] productArr;
    private int i = 0;
    private int sum = 0;
    private Map<String, Integer> buyItems;
    //
    public Buyer3(){
        buyItems = new HashMap();
        this.money = 1500;
        this.bonusPoint = 0;
        productArr = new Product2[10];
    }
    //
    public void buy(Product2 product2){
        //
        if (money == product2.getPrice()) {
            System.out.println("물품거래 가능이 초과 혹은 잔액이 부족");
            return;
        }
        else if (money < product2.getPrice()){
            money -= product2.getPrice();
            bonusPoint += product2.getBonusPoint();
            //
            String produntName = product2.getName();
            if(buyItems.containsKey(produntName)){
                buyItems.put(produntName, buyItems.get(produntName)+1);
            }
            else {
                buyItems.put(produntName,1);
            }
            System.out.printf("%s을/를 구매하였습니다.\n",produntName);
            //
            System.out.printf("%s를 샀습니다 잔액 : %d\n", product2.getName(), money);
        }
        sum += product2.getPrice();;
        this.productArr[i++] = product2;
        System.out.printf("[%s] [%d] [%d]\n", product2.getName(), money, bonusPoint);
    }
    //
    public void summary() {
        System.out.printf("총 구매금액: %,d, 남은금액: %,d, 보너스 포인트: %,d\n"
                , sum, money, bonusPoint);
        /*
        System.out.printf("%s: %d대", productNames[0], productCnts[0]);
        for(int i=1; i<productNames.length; i++) {
            System.out.printf(", %s: %d대", productNames[i], productCnts[i]);
        }
         */
            Set<String> namesSet = buyItems.keySet();
            Iterator<String> iterator = namesSet.iterator();
            while(iterator.hasNext()){
                String key = iterator.next();
                int cnt = buyItems.get(key);
                System.out.printf(" %s: %d대", key, cnt);
            }
            System.out.println("를 구매하였습니다.");
        }

}
//
class PolyArgumentTestVer2_2{
    //
    public static void main(String[] args){
        Tv2 tv = new Tv2(); // 생성자를 호출하지 않으면 객체화가 안된다.
        System.out.println(tv);
        //
        Computer2 com2 = new Computer2();
        System.out.println(com2);
        //
        Auido2 aui = new Auido2();
        System.out.println(aui);
    }
    //
}
//
class Tv2 extends Product2{ //
    //
    public Tv2(){
        super("Tv",100);
    }
    //
}
//
class Computer2 extends Product2{
    //
    public Computer2(){
        super("PC",200);
    }
}
//
class Auido2 extends Product2{
    //
    public Auido2(){
        super("Auido",500);
    }
}
//
class Product2{
    //
    private String name;
    private int price;
    private int bonusPoint;
    //
    public String getName(){ return name; }
    //
    public int getPrice(){ return price;}
    //
    public int getBonusPoint(){ return bonusPoint;}
    //
    public Product2(String name, int price) {
        //
        this.name = name;
        this.price = price;
        this.bonusPoint = (int)(price * 0.1f);
    }
    //
    public String toString(){
        return String.format("%s는 %d원, 적립은 %d원입니다.", name, price, bonusPoint);
    }
}

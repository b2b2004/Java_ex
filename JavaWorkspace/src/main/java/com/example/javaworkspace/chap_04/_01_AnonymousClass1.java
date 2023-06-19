package com.example.javaworkspace.chap_04;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스

        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("--------------");

        Coffee c2 = new Coffee();
        c2.order("라떼");
        System.out.println("--------------");

        Coffee specialCoffee = new Coffee(){
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케이크 서비스");
            }
        };

        specialCoffee.order("바닐라라떼");

    }
}

class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료 되었습니다.");
    }
}

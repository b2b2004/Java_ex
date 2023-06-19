package com.example.javaworkspace.chap_04;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("--------------------");

        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();

    }

    private static HomeMadeBurger getBroMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 햄버거빵, 치즈, 햄, 딸기잼");
            }
        };
    }

    public static HomeMadeBurger getMomMadeBurger(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제 버거");
                System.out.println("재료 : 빵, 베이컨, 양상추, 토마토, 쇠고기패티");
            }
    };
}

}

abstract class HomeMadeBurger{
    public abstract void cook();
}

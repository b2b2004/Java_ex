package com.example.javaworkspace.chap_03;

import com.example.javaworkspace.chap_03.coffee.*;
import com.example.javaworkspace.chap_03.user.User;
import com.example.javaworkspace.chap_03.user.VIPUser;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클래스

        // 커피 웨이팅 시 번호가 아니라 닉네님으로 주문한 경우
        // 두개 다 만들기에는 너무 비효율적 -> 제네릭 클래스를 쓰자
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("권용호");
        c2.ready();

        System.out.println("------------------------");
        CoffeeByName c3 = new CoffeeByName(35); // Object
        c3.ready();
        CoffeeByName c4 = new CoffeeByName("유재석"); // Object
        c4.ready();

        System.out.println("------------------------");
        // 오류 발생 시 int -> String 으로 변형 되는 오류
        // 형 변환도 다 해줘야 됨

        String c4Name = (String)c4.name;
        // c4.name = (String) c3.name;
        // int -> String (X)

        System.out.println("------------------------");
        // Generic 클래스 사용

        Coffee<Integer> c5 = new Coffee<>(36);
        c5.ready();
        // 형 변환이 필요 없음
        int c5Name = c5.name;
        System.out.println("주문 고객 번호 : " + c5Name);

        Coffee<String> c6 = new Coffee<>("박명수");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름 : " + c6Name);

        System.out.println("------------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("강호동"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VIPUser("권용호"));
        c8.ready();

        System.out.println("------------------------");
        orderCoffee("김영철");
        orderCoffee(15);

    }
    
    public static <T> void orderCoffee(T name){
        System.out.println("커피 준비 완료 : " + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee){
        System.out.println(coffee+ " 준비 완료 : " + name);
    }
    
}

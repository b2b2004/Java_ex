package com.example.javaworkspace.chap_01;

public class _10_AccessModifier {

    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 정보은닉 (Information hiding)

        // 접근 제어자 (변수/클래스 동일)
        // private : 해달 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스인 경우 접근 가능

        BlackBoxRefurish b1 = new BlackBoxRefurish();
        b1.setModelName("Model1");
        b1.setPrice(-5000);
        b1.setColor("화이트");

        // b1.price = 10000; 오류 private를 붙혔기 때문에
        // getter setter로만 접근가능

        System.out.println(b1.toString());
    }

}

package com.example.javaworkspace.chap_01;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox1 b1 = new BlackBox1();
        b1.setModelName("Model1");
        b1.setPrice(-5000);
        b1.setColor("화이트");

        // 객체 초기값 설정 validation 가능
        System.out.println("가격: " + b1.getPrice() + "원");
        System.out.println("해상도: " + b1.getResolution());
    }
}

package com.example.javaworkspace.chap_01;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 OOP (Object-Oriented Programing)
        // 유지보수 용이
        // 재사용성 용이

        // 블랙박스 (모델명, 해상도, 가격, 색상)

        // Model1
        String modelName = "Model1";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        // Model2
        String modelName2 = "Model2";
        String resolution2 = "UHD";
        int price2 = 300000;
        String color2 = "화이트";

        // 제품이 수십개가 있다면?
        BlackBox bbox = new BlackBox();

    }
}

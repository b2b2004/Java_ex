package com.example.javaworkspace.chap_01;

public class _08_Constructor {
    public static void main(String[] args) {

        BlackBox b1 = new BlackBox();

        BlackBox b2 = new BlackBox("Model5", "UHD", 300000, "화이트");
        System.out.println(b2.toString());

        // serialNumber 3 확인
        BlackBox b3 = new BlackBox();
        System.out.println(b3.toString());
    }
}

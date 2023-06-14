package com.example.javaworkspace.chap_01;

public class _07_This {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Model1";
        b1.appendModelName("(최신형)");
        System.out.println(b1.toString());
    }
}
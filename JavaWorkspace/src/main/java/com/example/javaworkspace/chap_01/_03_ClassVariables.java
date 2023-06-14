package com.example.javaworkspace.chap_01;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Model3";
        System.out.println(b1.toString());

        BlackBox b2 = new BlackBox();
        b2.modelName = "Model4";
        System.out.println(b2.toString());


        // 클래스 변수 변경
        BlackBox.conAutoReport = true;
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        // 클래스로 만들어진 객체에 변수를 바꿔도 클래스 변수에 영향을 준다. 왜?
        b1.conAutoReport = false;
        System.out.println(b1.toString());
        System.out.println(b2.toString());
    }
}

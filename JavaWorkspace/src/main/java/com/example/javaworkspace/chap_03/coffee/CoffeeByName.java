package com.example.javaworkspace.chap_03.coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + name);
    }
}

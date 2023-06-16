package com.example.javaworkspace.chap_03.coffee;

public class Coffee <T>{
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피가 준비 되었습니다 : " + name);
    }
}

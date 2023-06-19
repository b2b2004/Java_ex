package com.example.javaworkspace.chap_04;

import com.example.javaworkspace.chap_04.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
        // converter.convert(2);
        convertUSD(converter,1);

        // 함수형 인터페이스
        Convertible convertible = (USD) -> {
            System.out.println(USD + "달러 =" + (USD * 1400) + "원");
        };

        convertUSD(converter,2);

        // 전달값이 하나도 없다면?
        ConvertibleWithNoParams c1 = ()->{
            System.out.println("3달러 = 3900원");
        };
        c1.convert();

        // 전달값 2개
        ConvertibleWithTwoParams c2 = (USD, KRW) ->{
            System.out.println(USD + "달러 = " + (USD * KRW) + "원");
        };
        c2.convert(4, 1400);

        // 반환값이 있는 경우

        ConvertibleWithReturn c3 = (USD, KRW) ->{
            return (USD * KRW);
        };
        int result = c3.convert(5,1400);
        System.out.println(result);

    }

    public static void convertUSD(Convertible converter, int USD){
        converter.convert(USD);
    }
}
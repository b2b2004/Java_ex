package com.example.javaworkspace.chap_01;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        // import --> 다른 패키지에 있는 클래스를 사용하겠다.


        // java.util.Random 클래스를 쓰겠다.
        Random random = new Random();
        System.out.println(random.nextInt()); // int의 범위 내에서 정수형 값 반환
        System.out.println(random.nextInt(10)); // 0~10 미만 정수형 값 반환
        System.out.println(random.nextDouble()); // 0.0 ~ 1.0 미만 실수 값
    }
}

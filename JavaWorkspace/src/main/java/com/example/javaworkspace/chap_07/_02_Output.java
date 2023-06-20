package com.example.javaworkspace.chap_07;

public class _02_Output {
    public static void main(String[] args) {

        System.out.println("-------- 정수 ----------");
        System.out.printf("%d%n", 1);
        System.out.printf("%d %d %d %n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); //공간 6개 확보
        System.out.printf("%06d%n", 1234); // 001234
        System.out.printf("%6d%n", -1234); // _-1234
        System.out.printf("%+6d%n", 1234); // _+1234
        System.out.printf("%,15d%n", 10000000); // 10,000,000
        System.out.printf("%-6d%n", 1234); // 1234__ 왼쪽 정렬

        System.out.println("-------- 실수 ----------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI); // 소수점 두자리
        System.out.printf("%06.2f%n", Math.PI); // 003.14 (빈공간 0)

        System.out.println("-------- 문자열 ----------");
        System.out.printf("%s%n", "Java");
        System.out.printf("%6s%n", "Java"); // 6자리 공간 확보 오른쪽 정렬
        System.out.printf("%-6s%n", "Java"); // 왼쪽 정렬
        System.out.printf("%6.2s%n", "Java"); // 6자리 공간 확보 후 우측 정렬해서 2글자 ____Ja
        System.out.printf("%-6.2s%n", "Java"); // 6자리 공간 확보 후 좌측 정렬해서 2글자 Ja____

        System.out.println("-------- 응용 ----------");
        System.out.println("이름      영어   수학   평균");
        System.out.printf("%-6s %4d %4d %6.1f%n","강백호", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","서태웅", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n","채치수", 95, 100, 97.5);

    }
}

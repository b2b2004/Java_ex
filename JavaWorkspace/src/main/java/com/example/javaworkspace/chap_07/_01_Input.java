package com.example.javaworkspace.chap_07;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("정체가 무엇이냐");
        String a = sc.nextLine();

        System.out.print("이름 입력: ");
        String name = sc.next();

        System.out.print("키 입력:");
        int height = sc.nextInt();

        System.out.print("몸무게:");
        double weight = sc.nextDouble();


        System.out.println(name);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(a);

    }
}

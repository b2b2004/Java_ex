package com.example.javaworkspace.chap_03;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A" ,"B" ,"C" ,"D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("-------------------");

        // 제네릭스에서 제공하는 건 객체이다.
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    // 서른 다른 타입의 데이터가 들어와도 처리하겠다.
    // T : Type / K : Key / V : Value / E : Element
    private static <T> void printAnyArray(T[] array){
        for(T t: array){
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for(String i: sArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for(Double i: dArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printIntArray(Integer[] iArray) {
        for(int i: iArray){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

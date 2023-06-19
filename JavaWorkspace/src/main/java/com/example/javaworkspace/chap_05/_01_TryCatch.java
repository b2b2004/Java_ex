package com.example.javaworkspace.chap_05;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류
        // 런타임 오류 : (에러 error, 예외 exception)

        try {
            System.out.println(3/0);
        }catch (Exception e){
            System.out.println("오류 발생 " + e.getMessage());
            e.printStackTrace();
        }
    }
}

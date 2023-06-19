package com.example.javaworkspace.chap_05;

public class _04_Finally {
    public static void main(String[] args) {

        try {
            System.out.println("택시 타기");
            throw new Exception("휴무 택시");
        }catch (Exception e){
            System.out.println("문제 발생 " + e.getMessage());
        }finally {
            // 데이터베이스 커낵션을 닫거나 등등
            // 임시 파일 삭제 등등
            System.out.println("문을 닫는다.");
        }
    }
}

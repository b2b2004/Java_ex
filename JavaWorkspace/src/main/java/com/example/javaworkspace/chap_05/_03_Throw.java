package com.example.javaworkspace.chap_05;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;
        try{

            if(age < 19){
                System.out.println("만 19세 미만 담배 판매 금지");
                throw new Exception("만 19세 미만에게는 판매 하지 않습니다.");
            }else {
                System.out.println("담배 판매 가능");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

package com.example.javaworkspace.chap_05;

public class _06_CustomException {
    public static void main(String[] args) {
        // 사용자 정의 예외

        int age = 17;
        try{
            if(age < 19){
                System.out.println("만 19세 미만 담배 판매 금지");
                throw new AgeLessThan19Exception("만 19세 미만에게는 판매 하지 않습니다.");
            }else {
                System.out.println("담배 판매 가능");
            }
        }catch (AgeLessThan19Exception e){
            System.out.println("19세 이후에 오세요.");
        }
        catch (Exception e){
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19Exception extends Exception{
    public AgeLessThan19Exception(String message) {
        super(message);
    }
}
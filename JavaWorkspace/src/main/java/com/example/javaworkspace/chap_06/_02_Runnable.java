package com.example.javaworkspace.chap_06;

import com.example.javaworkspace.chap_06.clean.CleanRunnable;

public class _02_Runnable {
    // 쓰레드를 쓰면서 상속이 필요할때 용이
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();
        cleanByBoss();
    }

    public static void cleanByBoss(){
        System.out.println("사장 청소 시작");
        for(int i=1; i <= 10; i += 2){
            System.out.println("사장 " + i + "번방 청소중");
        }
        System.out.println("사장 청소 끝");
    }
}

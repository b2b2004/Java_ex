package com.example.javaworkspace.chap_06;

import com.example.javaworkspace.chap_06.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) throws InterruptedException {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);

        thread.start();
        try {
            thread.join(2500); // 2.5초 대기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        cleanByBoss();
    }

    public static void cleanByBoss() throws InterruptedException {
        System.out.println("사장 청소 시작");
        for(int i=1; i <= 10; i += 2){
            System.out.println("사장 " + i + "번방 청소중");
            Thread.sleep(1000);
        }
        System.out.println("사장 청소 끝");
    }
}

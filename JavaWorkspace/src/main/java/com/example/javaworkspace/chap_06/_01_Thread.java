package com.example.javaworkspace.chap_06;

import com.example.javaworkspace.chap_06.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드
        // cleanBySelf();

        CleanThread cleanThread = new CleanThread();
        // cleanThread.run();
        cleanThread.start();
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
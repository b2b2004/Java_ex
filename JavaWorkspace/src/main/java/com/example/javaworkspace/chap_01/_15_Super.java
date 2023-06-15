package com.example.javaworkspace.chap_01;

import com.example.javaworkspace.chap_01.camera.FatoryCam;
import com.example.javaworkspace.chap_01.camera.SpeedCam;

public class _15_Super {
    public static void main(String[] args) {
        // Super
        // 부모 클래스의 어떤 것을 자식 클래스에서 사용하겠다.
        // super() --> 부모클래스의 생성자 접근

        FatoryCam fatoryCam = new FatoryCam();
        SpeedCam speedCam = new SpeedCam();

        fatoryCam.recordVideo();
        System.out.println("--------------------------");
        speedCam.takePicture();

    }
}

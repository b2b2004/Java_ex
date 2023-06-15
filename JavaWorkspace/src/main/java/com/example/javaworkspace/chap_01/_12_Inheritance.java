package com.example.javaworkspace.chap_01;

import com.example.javaworkspace.chap_01.camera.Camera;
import com.example.javaworkspace.chap_01.camera.FatoryCam;
import com.example.javaworkspace.chap_01.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 모든 클래스는 Object를 거의 상속하고있다.
        // 부모 클래스에서 제공하는 모든 내용을 자식 클래스에서 가져다 쓴다.

        // extends 상속
        // implements interface

        Camera camera = new Camera();
        FatoryCam fatoryCam = new FatoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(fatoryCam.toString());
        System.out.println(speedCam.toString());
        fatoryCam.recordVideo();
        speedCam.takePicture();


    }
}

package com.example.javaworkspace.chap_02;

import com.example.javaworkspace.chap_02.camera.Camera;
import com.example.javaworkspace.chap_02.camera.FactoryCam;
import com.example.javaworkspace.chap_02.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Data Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않은 클래스)
        // 추상 메소드 추상 클래스 또는 인터페이스에서 사용 가능한 껍데기만 있는 메소드

        // 추상 클래스는 객체 생성이 안됨
        // Camera camera = new Camera();

        // 추상 클래스를 상속한 자식 클래스 생성은 됨
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}

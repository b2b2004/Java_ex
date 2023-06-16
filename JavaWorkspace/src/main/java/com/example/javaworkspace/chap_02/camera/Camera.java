package com.example.javaworkspace.chap_02.camera;

// 추상 클래스
public abstract class Camera {
    public void takePicture(){
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo(){
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 상속하는 자식 클래스에서 구현해야되는 메소드
}

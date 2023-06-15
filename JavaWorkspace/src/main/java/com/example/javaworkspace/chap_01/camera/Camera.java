package com.example.javaworkspace.chap_01.camera;

public class Camera {

    public String name;

    public Camera() {
        this.name = "카메라";
    }

    protected Camera(String name){
        this.name = name;
    }

    public void takePicture(){
        // 사진 촬영
        System.out.println(this.name + ": 사진 촬영합니다.");
    }

    public void recordVideo(){
        // 동영상 녹화
        System.out.println(this.name + ": 동영상 녹화합니다.");
    }

    public void showMainFeature(){
        System.out.println(this.name + "의 주요 기능: 사진촬영, 동영상 녹화");
    }

    @Override
    public String toString() {
        return "Camera{" +
                "name='" + name + '\'' +
                '}';
    }
}

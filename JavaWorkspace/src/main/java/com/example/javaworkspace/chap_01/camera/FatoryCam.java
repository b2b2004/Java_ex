package com.example.javaworkspace.chap_01.camera;

// FatoryCam is a Camera
public class FatoryCam extends Camera{

    public FatoryCam(){
       super("공장 카메라");
    }

    public void recordVideo(){ // 오버라이딩

        super.recordVideo();
        checkFactory();
        detectFire();
    }

    public void checkFactory() {
        System.out.println("공장 CCTV 확인");
    }

    public void detectFire() {
        System.out.println("화재를 감지 합니다.");
    }
    @Override // 애노테이션 오버라이드
    public  void showMainFeature(){
        System.out.println(this.name + "의 주요기능 화재 방지");
    }
}

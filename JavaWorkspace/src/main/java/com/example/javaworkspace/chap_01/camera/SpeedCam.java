package com.example.javaworkspace.chap_01.camera;

// SpeedCam is a Camera
public class SpeedCam extends Camera {

    public SpeedCam(){
        super("과속 단속 카메라");
    }

    public void takePicture(){
        super.takePicture();
        checkSpeed();
        recognizeLicensePlate();
    }

    public void checkSpeed() {
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }

    @Override // 애노테이션 오버라이드
    public  void showMainFeature(){
        System.out.println(this.name + "의 주요기능 과속 단속");
    }


}

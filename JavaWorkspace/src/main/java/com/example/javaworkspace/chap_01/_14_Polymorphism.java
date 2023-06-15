package com.example.javaworkspace.chap_01;

import com.example.javaworkspace.chap_01.camera.Camera;
import com.example.javaworkspace.chap_01.camera.FatoryCam;
import com.example.javaworkspace.chap_01.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // class Person: 사람
        // class Student extends Person 학생 (Student is a person)
        // class Teacher extends Person 선생님(Teacher is a person)
        // 상속은 부모와 자식의 is a 관계이다.

        // 다형성
        Camera camera = new Camera();
        Camera factoryCam = new FatoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("---------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FatoryCam();
        cameras[2] = new SpeedCam();

        for(Camera cam : cameras){
            cam.showMainFeature();
        }

        System.out.println("---------------------");

        // 자식 클래스에 있는 메소드는 접근 불가
        // factoryCam.checkFactory();

        if(camera instanceof Camera){
            System.out.println("카메라 입니다.");
        }

        if(factoryCam instanceof FatoryCam){
            ((FatoryCam) factoryCam).checkFactory(); // 형변환
        }

        if(speedCam instanceof  SpeedCam){
            ((SpeedCam)speedCam).checkSpeed();
        }

    }
}

package com.example.javaworkspace.chap_01;

import com.example.javaworkspace.chap_01.camera.Camera;
import com.example.javaworkspace.chap_01.camera.FatoryCam;
import com.example.javaworkspace.chap_01.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 오버로딩 : 같은 클래스 내에서 똑같은 이름을 가진 메소드를 파라미터의 수를 통해서 다르게 수행
        // 오버라이딩 : 자식 클래스에서 부모 클래스의 메소드를 덮어 쓰기(재정의)

        Camera camera = new Camera();
        FatoryCam fatoryCam = new FatoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        fatoryCam.showMainFeature(); // 오버라이딩
        speedCam.showMainFeature(); // 오버라이딩
    }
}

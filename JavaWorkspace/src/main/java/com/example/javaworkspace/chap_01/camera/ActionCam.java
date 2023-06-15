package com.example.javaworkspace.chap_01.camera;

public final class ActionCam extends Camera{ // 클래스에 final 붙힐 시 상속이 불가능
    public final String lens; // final 설정해도 생성자에서 선언해도 된다.
    public ActionCam(){
        super("액션 카메라"); // 부모의 생성자에 접근
        this.lens = "광각 렌즈"; // ㅇ
    }

    public final void makeVideo(){ // final 설정 시 자식 클래스에서 오버라이딩 불가능
        System.out.println(this.name + ":" + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}

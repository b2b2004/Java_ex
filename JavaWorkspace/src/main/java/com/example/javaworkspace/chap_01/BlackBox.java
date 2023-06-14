package com.example.javaworkspace.chap_01;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;

    // 클래스 변수 (static)
    static boolean conAutoReport = false;

    // 추가
    int serialNumber;
    // 시리얼 번호를 생성해주는 역할
    static int counter = 0;

    BlackBox(){
        System.out.println("생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시얼 넘버 발급" + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color){

        this(); // 기본 생성자에 먼저 접근 하고 옴
        System.out.println("정의 생성자 호출");
        this.modelName = modelName;
        this.color = color;
        this.price = price;
        this.resolution = resolution;
    }

    public String toString() {
        return "BlackBox{" +
                "modelName='" + modelName + '\'' +
                ", resolution='" + resolution + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", conAutoReport='" + conAutoReport + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    // 메소드
    void autoReport(){
        if(conAutoReport){
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }else{
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capaciry){
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량 = " + capaciry +"GB 입니다.");
    }

    int getVideoFileCount(int type){
        if(type == 1){
            // 일반 영상
            return 9;
        }
        else if(type == 2){
            return 1;
        }
        return 10;
    }

    // 메소드 오버로딩
    void record(boolean showDataTime, boolean showSpeed, int min){
        System.out.println("녹화를 시작합니다.");

        if(showDataTime){
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }

        if(showSpeed){
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " +  min + "분 단위로 기록됩니다.");
    }

    void record(){
        record(true, true, 6);
    }

    // 클래스 메소드 (static)
    static void callServiceCenter(){
        System.out.println("서비스센터(1588-1234)로 연결합니다.");

        // 클래스 변수 접근가능
        conAutoReport = false;
    }

    // This 클래스 인스턴스 modelName에 함수로 (최신형) 추가하기
    void appendModelName(String modelName) {
        this.modelName += modelName;
    }
}

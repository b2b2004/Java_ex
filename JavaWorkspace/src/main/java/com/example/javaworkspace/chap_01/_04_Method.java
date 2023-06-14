package com.example.javaworkspace.chap_01;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "Model4";

        b1.autoReport();
        BlackBox.conAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        // 일반 영상 : 1
        // 이벤트 영상(충동 시) : 9;
        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수 :" + fileCount + "개");

        fileCount = b1.getVideoFileCount(2);
        System.out.println("일반 영상 파일 수 :" + fileCount + "개");
    }
}

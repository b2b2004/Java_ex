package com.example.javaworkspace.chap_07;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir(); // 폴더 생성

        if(folder.exists()){
            System.out.println("폴더가 존재합니다.");
            System.out.println("폴더 경로 : " + folder.getAbsolutePath());
        }


        folderName = "A/B/C";
        folder = new File(folderName);
        folder.mkdirs(); // 폴더 여러개 만들려면 mkdirs 써야함

        System.out.println("-------------------");

        if(folder.exists()){
            System.out.println("폴더가 존재합니다.");
            System.out.println("폴더 경로 : " + folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패");
        }

    }
}

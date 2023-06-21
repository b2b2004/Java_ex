package com.example.javaworkspace.chap_07;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        String fileName = "test.txt";
        File file = new File(fileName);

        try {
            file.createNewFile(); // 파일 생성
            if(file.exists()){
                System.out.println("파일이 이미 존재합니다.");
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 경로 : " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

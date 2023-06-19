package com.example.javaworkspace.chap_05;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
    public static void main(String[] args){
        // 메인에서 해결하기
        try {
            writeFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() throws IOException {
//        try {
//            FileWriter writer = new FileWriter("test.txt");
//            throw new IOException("파일 쓰기에 실패");
//        } catch (IOException e) {
//            e.printStackTrace();
//            System.out.println("writeFile 메소드 내에서 자체 해결");
//
//        }

        FileWriter writer = new FileWriter("test.txt");
        throw new IOException("파일 쓰기에 실패");
    }
}

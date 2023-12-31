package com.example.javaworkspace.chap_07;

import java.io.File;

public class _05_FileAndFolder {
    public static void main(String[] args) {
        String folder = "C:\\workspace\\springbootwork\\Java_ex\\JavaWorkspace\\src\\main\\java\\com\\example\\javaworkspace\\chap_07";
        File filesAndFolders = new File(folder);
        System.out.println("현재 폴더 경로 : " + filesAndFolders.getAbsolutePath());

        for (File file : filesAndFolders.listFiles()){
            if(file.exists()) {
                System.out.println("파일 : " + file.getName());
            }else if(file.isDirectory()){
                System.out.println("폴더 : " + file.getName());
            }
        }
    }
}

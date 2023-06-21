package com.example.javaworkspace.chap_07;

import java.io.File;

public class _07_DeleteFile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.delete()) {
            System.out.println("파일 삭제 성공 : " + file.getName());
        }else{
            System.out.println("파일 삭제 실패 : " + file.getName());
        }

        // 폴더 아래에 폴더가 있으면 삭제가 안됨
        File folder = new File("A");
        if(folder.exists()){
            if(folder.delete()) {
                System.out.println("폴더 삭제 성공 : " + folder.getName());
            }else{
                System.out.println("폴더 삭제 실패 : " + folder.getName());
            }
        }

        deleteFolder(folder);
    }

    // 재귀 호출을 이용한 폴더 삭제
    // deleteFolder(A)
    //      deleteFolder(B)
    //          deleteFolder(C)
    //          C.delete();
    //      B.delete();
    // A.delete();
    public static boolean deleteFolder(File folder){
        if(folder.isDirectory()){
            for(File file : folder.listFiles()){
                deleteFolder(file);
            }
        }
        System.out.println("삭제 대상 : " + folder.getAbsolutePath());
        return folder.delete();
    }
}

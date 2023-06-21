package com.example.javaworkspace.chap_07;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어 올때
        // BufferedWriter : 파일에 내용을 쓸 때

        //    public FileWriter(String fileName, boolean append) throws IOException {
        //        super(new FileOutputStream(fileName, append));
        //    }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt", true))) {
            bw.write("1. 안녕하세요");
            bw.newLine();
            bw.write("2. 권용호 입니다.");
            bw.newLine();
            bw.write("3. FileWriter(,true)");
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader br = new BufferedReader(new FileReader("goodjob.txt"))){
            String line;
            while ((line = br.readLine()) != null ){
                System.out.println(line);
            }
        }catch (IOException e){
            throw new RuntimeException();
        }
    }

}

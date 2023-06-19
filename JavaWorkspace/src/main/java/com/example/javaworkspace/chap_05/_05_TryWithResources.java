package com.example.javaworkspace.chap_05;

public class _05_TryWithResources {
    public static void main(String[] args) throws Exception {

        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("배고픕니다");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            writer1.close();
        }

        System.out.println("------------------------");

        // TryWithResources
        // AutoCloseable라는 interface를 구현해야됨
        try(MyFileWriter writer2 = new MyFileWriter()){
            writer2.write("운동을갑니다.");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line){
        System.out.println("파일의 내용을 입력합니다.");
        System.out.println("입력 내용: " + line);
    }
}

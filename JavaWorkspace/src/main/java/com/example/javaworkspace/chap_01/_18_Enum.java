package com.example.javaworkspace.chap_01;

public class _18_Enum {
    public static void main(String[] args) {
        // Enum(열거형)
        // 달력: JAN, FEB, MAR ...
        // 옷: S M L XL
        // 해상도: HD, FHD, QHD, UHD

        Resolution resolution = Resolution.HD;
        System.out.println(resolution); // HD

        resolution = Resolution.FHD;
        System.out.println(resolution); // FHD

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println(" ---------------------- ");
        for(Resolution myRes : Resolution.values()){
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }


    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;

    Resolution(int width){
        this.width = width;
    }

    public int getWidth(){
        return width;
    }
}
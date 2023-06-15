package com.example.javaworkspace.chap_01;

import com.example.javaworkspace.chap_01.camera.ActionCam;
import com.example.javaworkspace.chap_01.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final
        // public 다음에 위치함
        // public > abstract > static > final > ....
        ActionCam actionCam = new ActionCam();
        actionCam.recordVideo();
        actionCam.makeVideo();

        System.out.println("------------------------");
        SlowActionCam slowActionCam = new SlowActionCam();
//        slowActionCam.recordVideo();
//        slowActionCam.makeVideo();
    }
}

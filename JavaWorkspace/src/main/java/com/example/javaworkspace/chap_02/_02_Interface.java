package com.example.javaworkspace.chap_02;

import com.example.javaworkspace.chap_02.camera.FactoryCam;
import com.example.javaworkspace.chap_02.detector.AdvancedFireDetector;
import com.example.javaworkspace.chap_02.detector.Detectable;
import com.example.javaworkspace.chap_02.detector.FireDetector;
import com.example.javaworkspace.chap_02.repoter.NormalReporter;
import com.example.javaworkspace.chap_02.repoter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // extends = 단일 상속

        // 인터페이스
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();

        Detectable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReportor(normalReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}

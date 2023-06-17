package com.example.javaworkspace.chap_03;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트
        // 중복 허용 X, 순서 보장 X

        HashSet<String> set = new HashSet();

        // 데이터 추가
        set.add("닭가슴살");
        set.add("살치살");
        set.add("우둔살");
        set.add("홍두깨살");
        set.add("삼겹살");
        set.add("오겹살");
        set.add("삼겹살");

        System.out.println(set.size());
        // 중복이 허용되지 않음, 순서도 없음
        System.out.println("수 : " + set);

        if(set.contains("삼겹살")){
            System.out.println("삼겹살 있어요.");
        }

        System.out.println(set.size());

        //삭제
        set.remove("삼겹살");
        System.out.println(set);
        System.out.println("수 : " + set.size());
        set.clear();
        System.out.println(set);


    }
}

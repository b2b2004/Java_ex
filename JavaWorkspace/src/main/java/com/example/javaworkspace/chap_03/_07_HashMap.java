package com.example.javaworkspace.chap_03;

import java.util.HashMap;
import java.util.HashSet;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵(Key, Value)
        // Key 와 Value를 저장
        // 중복 허용 X, 순서 보장X
        // 순서를 보장하고 싶으면 LinkedHashMap를 쓰면 됨
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 데이터 추가
        hashMap.put("유재석", 10);
        hashMap.put("강호동", 20);
        hashMap.put("강호동", 20);
        hashMap.put("송지효", 30);
        hashMap.put("이수근", 40);

        System.out.println("총 고객 수 : " + hashMap.size());
        System.out.println(hashMap);

        // Key로 조회 --> Value 반환
        System.out.println("유재석님의 포인트 : " + hashMap.get("유재석"));

        // 확인
        if(hashMap.containsValue("서장훈")){
            System.out.println("서장훈씨가 있으십니다.");
        }else{
            System.out.println("서장훈 추가");
            hashMap.put("서장훈", 50);
        }
        System.out.println(hashMap);

        // 삭제
        hashMap.remove("송지효");
        System.out.println(hashMap);

        hashMap.clear();
        if(hashMap.isEmpty()){
            System.out.println("모두 삭제 되었습니다.");
        }

        hashMap.put("권용호", 1000);
        hashMap.put("유재석", 10);
        hashMap.put("강호동", 20);
        hashMap.put("송지효", 30);
        hashMap.put("이수근", 40);

        System.out.println(hashMap);

        // key 확인
        for(String key : hashMap.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();

        // value 확인
        for(Integer value : hashMap.values()){
            System.out.print(value + " ");
        }
        System.out.println();

        // key, value 확인
        for(String key : hashMap.keySet()){
            System.out.println("고객 이름 : " + key + " / 포인트 : " + hashMap.get(key));
        }
    }
}

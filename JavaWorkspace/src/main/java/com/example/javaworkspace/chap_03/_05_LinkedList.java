package com.example.javaworkspace.chap_03;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // 링크드 리스트

        LinkedList<String> list = new LinkedList<>();

        list.add("유재석");
        list.add("권용호");
        list.add("강호동");
        list.add("조세호");
        list.add("이광수");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        
        // 데이터 추가
        list.addFirst("송지효");
        System.out.println(list.getFirst());
        list.add("김종국");
        System.out.println(list);

        // 삭제
        list.remove(list.size() - 1);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        Collections.sort(list);
        for(String s: list){
            System.out.println("Collection.sort 정렬 : " + s);
        }
    }
}

package com.example.javaworkspace.chap_03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {

        // 그냥 배열은 선언하면 그 공간 만큼만 써야 되지만
        // 컬렌션 프레임워크를 이용하면 늘리고 줄이고 정렬하고 가능

        // 컬렉션 프레임워크
        // List, Set, Map

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        ArrayList<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("권용호");
        list.add("강호동");
        list.add("조세호");
        list.add("이광수");

        System.out.println(list + " 사람 수 : " + list.size());

        // 삭제
        list.remove(3);
        System.out.println(list + " 사람 수 : " + list.size());

        // 변경
        list.set(0, "킹재석");
        System.out.println(list + " 사람 수 : " + list.size());


        System.out.println("list.indexOf : " + list.indexOf("권용호"));
        System.out.println("list.contains : " + list.contains("권용호"));

        list.clear();
        System.out.println("list.clear() -> list.isEmpty() : " + list.isEmpty());

        list.add("유재석");
        list.add("권용호");
        list.add("강호동");
        list.add("조세호");
        list.add("이광수");

        Collections.sort(list);
        for(String s: list){
            System.out.println("Collection.sort 정렬 : " + s);
        }

    }
}

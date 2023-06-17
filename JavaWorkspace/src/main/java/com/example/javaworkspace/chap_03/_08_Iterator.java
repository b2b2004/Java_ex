package com.example.javaworkspace.chap_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        // 이터레이터
        // List, HashSet 등 사용가능
        List<String> list = new ArrayList<>();
        list.add("유재석");
        list.add("오류@");
        list.add("김종국");
        list.add("이광수");
        list.add("하하");
        list.add("권용호");

        System.out.println(list);

        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------");

        it = list.iterator(); // 커서를 처음 위치로 이동
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("오류@")){
                it.remove();
            }
        }

        System.out.println("---------------");
        it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

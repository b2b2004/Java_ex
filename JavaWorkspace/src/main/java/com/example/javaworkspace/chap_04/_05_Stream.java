package com.example.javaworkspace.chap_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {

        // 스트림

        // Arrays.Stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"py", "java", "c", "c++", "c#"};
        Stream<String> langstream = Arrays.stream(langs);

        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("py", "java", "c", "c++", "c#");
        System.out.println(langList.size());

        Stream<String> langListStream = langList.stream();

        // Stream.of
        Stream<String> langListOfStream = Stream.of("py", "java", "c", "c++", "c#");

        System.out.println("---------------------");
        // Stream 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip
        // 최종 연산 (Terminal Operation) : count, min, max, forEach, anyMatch, allMath

        // 90점 이상만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        System.out.println("---------------------");
        Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("---------------------");

        long count = Arrays.stream(scores).filter(x -> x>= 90).count();
        System.out.println(count);

        System.out.println("---------------------");
        // 90이상 점수들의 합
        count = Arrays.stream(scores).filter(x -> x>=90).sum();
        System.out.println(count);

        // 정렬
        System.out.println("---------------------");
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);


        // 문자열
        System.out.println("---------------------");
        System.out.println("---------------------");

        // c로 시작
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);

        // 3글자 이상
        System.out.println("---------------------");
        Arrays.stream(langs).filter(x -> x.length() > 3).sorted().forEach(System.out::println);

        System.out.println("---------------------");
        Arrays.stream(langs).filter(x -> x.length() <= 3)
                            .filter(x -> x.contains("c"))
                            .forEach(System.out::println);

        System.out.println("---------------------");
        boolean anyMatch = Arrays.stream(langs).filter(x -> x.length() <= 3)
                                               .anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);

        // 3글자 이하에 c 포함 글자에 어려워요 라는 글자를 함께 출력
        System.out.println("---------------------");
        Arrays.stream(langs).filter(x -> x.length() <= 3)
                            .filter(x -> x.contains("c"))
                            .map(x -> x + "(어렵다)")
                            .forEach(System.out::println);

        // 대문자로 바꾸기
        System.out.println("---------------------");
        Arrays.stream(langs).filter(x -> x.length() <= 3)
                            .filter(x -> x.contains("c"))
                            .map(String::toUpperCase)
                            .forEach(System.out::println);

        // c라는 글자 포함 대문자로 변경 후 리스트로 저장
        System.out.println("---------------------");
        List<String> c = Arrays.stream(langs).filter(x -> x.length() <= 3)
                .filter(x -> x.contains("c"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(c);

    }
}

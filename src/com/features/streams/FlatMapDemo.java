package com.features.streams;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main() {
        List<List<String>> sentences = List.of(
                List.of("Java", "is", "the", "best", "programming", "language"),
                List.of("FlatMap", "is", "powerful")
        );

        List<String> words = sentences.stream() // -> → Stream<List<String>>
                .flatMap(List::stream) //flattens Stream<List<String>> -> Stream<String>
                .collect(Collectors.toList());

        System.out.println(words);
    }
}

package com.features.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(1, 1_000_000).boxed().toList();

        // Using normal stream
        long start = System.currentTimeMillis();
        int sum1 = numbers.stream().mapToInt(x -> x * x).sum();
        long end = System.currentTimeMillis();

        System.out.println(STR."Sequentiel sum: \{sum1} in \{end - start} ns");

        // Using parallelStream
        start = System.currentTimeMillis();
        int sum2 = numbers.parallelStream().mapToInt(x -> x * x).sum();
        end = System.currentTimeMillis();
        System.out.println(STR."Parallelisel sum: \{sum2} in \{end - start} ns");
    }

    //On a multi-core CPU, the parallel version should be faster for large datasets, but only for CPU-heavy operations.
}

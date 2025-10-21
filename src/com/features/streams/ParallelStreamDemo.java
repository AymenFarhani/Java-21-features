package com.features.streams;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {
    static void main(String[] args) {
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
    /*
    Explanation:

    stream() processes sequentially, one by one.
    parallelStream() splits the list across threads in the ForkJoinPool.commonPool().
    Each thread processes part of the list, and results are merged at the end.
    On a multi-core CPU, the parallel version should be faster for large datasets, but only for CPU-heavy operations,
    Using on small data or I/O-bound tasks (can be slower)
     */
}

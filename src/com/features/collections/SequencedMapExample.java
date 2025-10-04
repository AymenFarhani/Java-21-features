package com.features.collections;

import java.util.LinkedHashMap;
import java.util.SequencedMap;

public class SequencedMapExample {

    void main() {
        SequencedMap<Integer, String> maps = new LinkedHashMap<>();

        maps.put(1, "John");
        maps.putFirst(3, "Bob");
        maps.putLast(2, "Joe");
        maps.put(4, "Charlie");

        System.out.println(maps.firstEntry());
        System.out.println(maps.lastEntry());

        System.out.println(maps);

        maps.pollFirstEntry();
        System.out.println(maps);

        maps.pollLastEntry();
        System.out.println(maps);
    }
}

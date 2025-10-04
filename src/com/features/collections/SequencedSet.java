package com.features.collections;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedSet {
    void main() {
        SequencedCollection<String> names = new ArrayList<>();

        // Adding elements
        names.addFirst("John");
        names.addLast("Joe");
        names.addFirst("Bob");
        names.addLast("Robert");

        System.out.println(names);
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

        names.removeFirst();
        names.removeLast();
        System.out.println(names);


    }
}

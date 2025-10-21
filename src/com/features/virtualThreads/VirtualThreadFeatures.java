package com.features.virtualThreads;

public class VirtualThreadFeatures {

    private static final ThreadLocal<String> context = ThreadLocal.withInitial(() -> "Default");

    public static void testVirtualThread() {
        context.set("Main Thread Context");
        new Thread(() -> System.out.println(STR."Child Thread: \{context.get()}")).start();
        System.out.println((STR."Main Thread: \{context.get()}"));

        Thread thread = Thread.ofVirtual().start(() -> System.out.println("Start a virtual Thread!!"));
        System.out.println(STR."Name: \{thread.getName()}");
    }
}

package com.globalpayex;

public class Greeter {
    public static void main(String[] args) {
        // Multithreaded
        // Thread - Good afternoon
        new Thread(() -> System.out.println("good afternoon")).start();

        // Thread - Good evening
        new Thread(() -> System.out.println("good evening")).start();

        // Thread - Good night
        new Thread(() -> System.out.println("good night")).start();

        // main thread
        System.out.println("Good morning");

    }
}

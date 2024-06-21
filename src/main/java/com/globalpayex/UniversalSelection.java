package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Random;

public class UniversalSelection {

    public static <T> T surpriseMe(T[] elements) {
        // 0 - elements.length - 1
        Random random = new Random();
        int n = random.nextInt(elements.length);
        return elements[n];
    }

    public static void main(String[] args) {
        String[] movies = {"3 idiots", "Avatar", "Terminator", "Robot"};
        String movie = surpriseMe(movies);
        System.out.println(movie);

        Student[] students = {
                new Student("mehul", 10, 'm', 90),
                new Student("jane", 13, 'f', 90),
                new Student("jill", 15, 'f', 90),
                new Student("jay", 16, 'm', 90)
        };
        Student monitor = surpriseMe(students);
        System.out.println(monitor);
    }
}

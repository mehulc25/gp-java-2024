package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    @Test
    void testMyArrayOfNumbers() {
        Integer[] nos = {6, 7, 10, 3, 2};
        var ma = new MyArray<Integer>(nos);

        assertEquals(6, ma.get(1));
        ma.set(2, 9);
        assertEquals(9, ma.get(2));
    }

    @Test
    void testMyArrayOfStudents() {
        Student[] students = {
                new Student("mehul", 10, 'm', 90),
                new Student("jane", 13, 'f', 90),
                new Student("jill", 15, 'f', 90),
                new Student("jay", 16, 'm', 90)
        };

        // var ma = new MyArray<Student>(students);
        MyArray<Student> ma = new MyArray<>(students);

        assertEquals("mehul", ma.get(1).getName());
        ma.set(2, new Student("priya", 13, 'f', 92));
        assertEquals("priya", ma.get(2).getName());
    }
}
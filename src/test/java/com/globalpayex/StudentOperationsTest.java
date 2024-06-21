package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentOperationsTest {

    @Test
    void testAverage() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("mehul", 10, 'm', 90));
        students.add(new Student("jane", 11, 'f', 84));
        students.add(new Student("jill", 13, 'f', 70));
        students.add(new Student("rahul", 16, 'm', 72));

        double expected = 79.0;
        double actual = StudentOperations.average(students);
        assertEquals(expected, actual);
    }
}
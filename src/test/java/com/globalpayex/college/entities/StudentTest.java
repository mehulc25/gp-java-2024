package com.globalpayex.college.entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void testObjectCreation() {
        var s1 = new Student();
        var s2 = new Student();

        assertTrue(s1 != s2);
        assertNull(s1.name);
        assertNull(s2.name);
        assertEquals(0, s1.roll);
        assertEquals(0, s2.roll);

        s1.roll = 10;
        s2.roll = 13;
        assertEquals(10, s1.roll);
        assertEquals(13, s2.roll);
    }

    @Test
    void testGetDetails() {
        var s1 = new Student();
        s1.name = "jane";
        s1.roll = 10;
        s1.gender = 'f';
        s1.marks = 90;
        String expected = "Name: jane\nGender: f\nRoll: 10\nMarks: 90";

        String actual = s1.getDetails();
        assertEquals(expected, actual);
    }

    @Test
    void testCalculateGrade() {
        var s1 = new Student();
        s1.name = "jane";
        s1.roll = 10;
        s1.gender = 'f';
        s1.marks = 65;
        char expected = 'B';

        char actual = s1.calculateGrade();
        assertEquals(expected, actual);
    }
}
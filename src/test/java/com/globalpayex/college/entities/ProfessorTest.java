package com.globalpayex.college.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @BeforeEach
    void init() {
        Professor.count = 0;
    }

    @Test
    void testProfessorCount() {
        assertEquals(0, Professor.count);

        String[] subjects = {"Physics", "Maths"};
        var p1 = new Professor("mehul", 'm', subjects);
        var p2 = new Professor("jane", 'f', subjects);

        assertEquals(2, Professor.count);
    }

    @Test
    void testProfessorDetails() {
        String[] subjects = {"Physics", "Maths"};
        var p1 = new Professor("mehul", 'm', subjects);
        String expected = "Name: mehul\nGender: m";

        assertEquals(expected, p1.getDetails());
    }
}
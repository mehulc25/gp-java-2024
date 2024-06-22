package com.globalpayex;

import com.globalpayex.college.entities.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TestArrayList {

    @Test
    void testArrayList() {
        ArrayList<String> cars = new ArrayList<>();
        assertEquals(0, cars.size());

        // add
        cars.add("i10");
        cars.add("i20");
        assertEquals("i10", cars.get(0));
        assertEquals("i20", cars.get(1));

        cars.add(1, "mercedes");
        assertEquals("i20", cars.get(2));
        assertEquals("mercedes", cars.get(1));

        // update
        cars.set(0, "audi");
        assertEquals("audi", cars.get(0));

        // remove
        cars.remove(0);
        assertEquals("mercedes", cars.get(0));
        cars.remove("mercedes");
        assertEquals("i20", cars.get(0));
        assertFalse(cars.isEmpty());

        assertTrue(cars.contains("i20"));
        assertFalse(cars.contains("audi"));
    }

    @Test
    void testSortingAscending() {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        Collections.sort(nos);
        assertEquals(1, nos.get(0));
        assertEquals(10, nos.get(nos.size()-1));
        System.out.println(nos.getClass());
        System.out.println(nos);
    }

    @Test
    void testSortingDescending() {
        // inner class
        /* class DescComparator implements Comparator<Integer> {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 < o2 : -1
                // o1 == o2 : 0
                // o1 > o2 : 1
                return o2.compareTo(o1);
            }
        } */

        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        // Collections.sort(nos, new DescComparator());

        // annonymous inner class
        /* Collections.sort(nos, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }); */

        // Lambda expressions Java 8
        // Functional programming
        Collections.sort(nos, (o1, o2) -> o2.compareTo(o1));

        assertEquals(10, nos.get(0));
        assertEquals(1, nos.get(nos.size()-1));
        System.out.println(nos);
    }

    @Test
    void testEvenNosMoreThan2() {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        // create a new list consisting of only even nos more than 2 from the nos list
        // test the new list
        /* var nl = new ArrayList<Integer>();
        var expected = Arrays.asList(10, 4, 8);
        nos.forEach(no -> {
            if (no % 2 == 0 && no > 2) {
                nl.add(no);
            }
        });
        assertEquals(expected, nl); */
        var expected = Arrays.asList(10, 4, 8);
        var nl = nos.stream()
                .filter(element -> element % 2 == 0 && element > 2)
                .collect(Collectors.toList());
        assertEquals(expected, nl);
    }

    @Test
    void testDeductingBy1() {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        // to build up a new list consisting of all elements from nos list deducted by 1
        var expected = Arrays.asList(9, 3, 0, 8, 7, 6);

        // mapping
        var actual = nos.stream()
                .map(t -> t - 1)
                .collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void testFilterPlusMap() {
        var nos = Arrays.asList(10, 4, 1, 9, 8, 7);
        // to build up a new list
            // filter all odd elements more than 1 from the nos list
            // square each of the odd elements that have been filtered out in the above step
            // collect it in a list
        var expected = Arrays.asList(81, 49);

        var actual = nos.stream()
                .filter(t -> t % 2 != 0 && t > 1)
                .map(t -> t * t)
                .collect(Collectors.toList());
        assertEquals(expected, actual);
    }

    @Test
    void testStudents1() {
        var students = Arrays.asList(
                new Student("mehul", 10, 'm', 90),
                new Student("jane", 11, 'f', 84),
                new Student("jill", 13, 'f', 70),
                new Student("rahul", 16, 'm', 72)
        );
        // find the names of all female students comma separated
        var expected = "jane,jill";

        var actual = students.stream()
                .filter(student -> student.getGender() == 'f')
                .map(student -> student.getName())
                .collect(Collectors.joining(","));
        assertEquals(expected, actual);
    }

    @Test
    void testStudents2() {
        var students = Arrays.asList(
                new Student("mehul", 10, 'm', 90),
                new Student("jane", 11, 'f', 84),
                new Student("jill", 13, 'f', 70),
                new Student("rahul", 16, 'm', 72)
        );
        // create a new list of female Student objects sorted in the descending order
        // of marks
        var expected = Arrays.asList(
                new Student("jane", 11, 'f', 84),
                new Student("jill", 13, 'f', 70)
        );
        var actual = students.stream()
                .filter(student -> student.getGender() == 'f')
                .sorted((s1, s2) -> Integer.valueOf(s2.marks).compareTo(Integer.valueOf(s1.marks)))
                .collect(Collectors.toList());
        System.out.println(expected);
        System.out.println(actual);
        assertEquals(expected.get(0).marks, actual.get(0).marks);
        assertEquals(expected.get(1).marks, actual.get(1).marks);
    }
}

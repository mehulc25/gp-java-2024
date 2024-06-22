package com.globalpayex;

import com.globalpayex.college.entities.Student;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class SearchStudents {

    public static void main(String[] args) {
        /* var students = Arrays.asList(
                new Student("mehul", 10, 'm', 90),
                new Student("jane", 5, 'f', 84),
                new Student("jill", 12, 'f', 70),
                new Student("rahul", 23, 'm', 72)
        ); */
        HashMap<Integer, Student> studentsMap = new HashMap<>();
        studentsMap.put(10, new Student("mehul", 10, 'm', 90));
        studentsMap.put(5, new Student("jane", 5, 'f', 84));
        studentsMap.put(12, new Student("jill", 12, 'f', 70));
        studentsMap.put(23, new Student("rahul", 23, 'm', 72));

        // take roll no on the basis of which the user wants to search as user input
        // if student found for that roll number, print the student details
        // if not found, print "Not found"

        System.out.println("please enter the roll no: ");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();

        Student student = studentsMap.get(r);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("student not found");
        }

        /* if(students.contains(new Student("", r, 'm', 0))) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        } */

        /* boolean isFound = false;
        for(Student student: students) {
            if (student.roll == r) {
                isFound = true;
                System.out.println(student);
                break;
            }
        }
        if (!isFound) {
            System.out.println("Not found");
        } */
    }
}

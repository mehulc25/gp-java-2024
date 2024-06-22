package com.globalpayex.college.entities;

import java.util.Objects;

// every class in java gets 1 Class object in the RAM
public class Student extends CollegeUser {
    // Object attributes
    // instance variables
    public int roll;
    public int marks;

    // class attribute
    static int count;

    public Student(){
        this("NA", -1, 'm', 0);
    }

    public Student(String name, int roll, char gender, int marks) {
        // this --- current object
        super(name, gender); // first line
        Student.count++;
        this.roll = roll;
        this.marks = marks;
    }

    public static Student createInstance(String name, int roll, char gender, int marks) {
        var s = new Student(name, roll, gender, marks);
        return s;
    }

    // default
    // public Student() {}


    @Override
    public String getDetails() {
        String part1 = super.getDetails();
        return String.format(
                "%s\nRoll: %s\nMarks: %s",
                part1,
                this.roll,
                this.marks
        );
    }

    public char calculateGrade() {
        // this
        var marks = this.marks;
        char result;
        if (marks > 100 || marks < 0) {
            result = 'I';
        } else if (marks >= 70) {
            result = 'A';
        } else if (marks >= 60) {
            result = 'B';
        } else if (marks >= 40) {
            result = 'C';
        } else {
            result = 'F';
        }

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll);
    }
}

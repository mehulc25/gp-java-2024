package com.globalpayex.college.entities;

public class Student {
    // Object attributes
    // instance variables
    String name;
    char gender;
    int roll;
    int marks;

    public String getDetails() {
        // implicit parameter - this - s1, s2, s10 -- current object
        return "Name: " + this.name + "\nGender: " + this.gender + "\nRoll: " + this.roll +
                "\nMarks: " + this.marks;
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
}

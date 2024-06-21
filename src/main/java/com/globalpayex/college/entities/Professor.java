package com.globalpayex.college.entities;

public class Professor extends CollegeUser {
    private String[] subjects;
    public static int count;

    public Professor(String name, char gender, String[] subjects) {
        super(name, gender);
        Professor.count++;
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
}

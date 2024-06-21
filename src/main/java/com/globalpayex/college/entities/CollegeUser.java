package com.globalpayex.college.entities;

// implicitly extends from the Object class
public class CollegeUser {

    protected String name;
    protected char gender;

    public CollegeUser(String name, char gender) {
        this.name = name;
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender;
        }
    }

    public String getDetails() {
        // this ---> current object ---> Student, Professor
        return String.format(
                "Name: %s\nGender: %s",
                this.name,
                this.gender
        );
    }

    @Override
    public String toString() {
        return "CollegeUser{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

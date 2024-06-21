package com.globalpayex.college.entities;

import com.abc.salary.SalariedIndividual;

public class Professor extends CollegeUser implements SalariedIndividual {
    private String[] subjects;
    private int noOfDaysWorked;
    private int costPerDay;
    public static int count;

    public Professor(String name, char gender, String[] subjects, int noOfDaysWorked, int costPerDay) {
        super(name, gender);
        Professor.count++;
        this.subjects = subjects;
        this.noOfDaysWorked = noOfDaysWorked;
        this.costPerDay = costPerDay;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    @Override
    public int getDaysWorkedInMonth() {
        return this.noOfDaysWorked;
    }

    @Override
    public int getCommercialsPerDay() {
        return this.costPerDay;
    }
}

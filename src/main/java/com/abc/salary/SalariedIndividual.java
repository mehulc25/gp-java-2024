package com.abc.salary;

public interface SalariedIndividual {
    int getDaysWorkedInMonth();

    int getCommercialsPerDay();

    // non abstract methods - default methods
    default double calculate() {
        int noOfDaysWorked = this.getDaysWorkedInMonth();
        int costPerDay = this.getCommercialsPerDay();

        int totalCost = noOfDaysWorked * costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;

        return totalCostAfterPt - tds;
    }
}

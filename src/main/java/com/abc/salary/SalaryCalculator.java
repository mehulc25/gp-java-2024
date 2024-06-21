package com.abc.salary;

@Deprecated()
public class SalaryCalculator {

    public static double calculate(SalariedIndividual si) {
        int noOfDaysWorked = si.getDaysWorkedInMonth();
        int costPerDay = si.getCommercialsPerDay();

        int totalCost = noOfDaysWorked * costPerDay;
        int totalCostAfterPt = totalCost - 200;
        double tds = 0.1 * totalCostAfterPt;

        return totalCostAfterPt - tds;
    }
}

package org.example.jun202342Done;

public class Manager extends Employee {

    double BonusValue;

    public Manager(double BonusValue, double HourlyPay, String EmployeeNumber, String JobTitle) {
        super(HourlyPay, EmployeeNumber, JobTitle);
        this.BonusValue = BonusValue;
    }

    public void SetPay(int weekNumber, double hoursWorked) {
        hoursWorked = hoursWorked + hoursWorked * BonusValue / 100;
        super.SetPay(weekNumber, hoursWorked);
    }

}

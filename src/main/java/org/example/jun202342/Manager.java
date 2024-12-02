package org.example.jun202342;

public class Manager extends Employee {

    double BonusValue;

    public Manager(String employeeNumber, String jobTitle, double[] payYear2022, double bonusValue) {
        super(employeeNumber, jobTitle, payYear2022);
        BonusValue = bonusValue;
    }

    public void SetPay(int weekNumber, double hoursWorked) {
        hoursWorked = hoursWorked + (hoursWorked * BonusValue / 100);
        super.SetPay(weekNumber, hoursWorked);
    }

}

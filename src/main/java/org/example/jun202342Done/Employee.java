package org.example.jun202342Done;

public class Employee {

    double HourlyPay;
    String EmployeeNumber;
    String JobTitle;
    double[] PayYear2022 = new double[51];

    public Employee(double HourlyPay, String EmployeeNumber, String JobTitle) {
        this.HourlyPay = HourlyPay;
        this.EmployeeNumber = EmployeeNumber;
        this.JobTitle = JobTitle;
        for (int i = 0; i < PayYear2022.length; i++) {
            PayYear2022[i] = 0.0;
        }
    }

    public String GetEmployeeNumber() {
        return EmployeeNumber;
    }

    public void SetPay(int weekNumber, double hoursWorked) {
        double weekPay = hoursWorked * HourlyPay;
        PayYear2022[weekNumber - 1] = weekPay;
    }

    public double GetTotalPay() {
        double totalPay = 0;
        for (int i = 0; i < PayYear2022.length; i++) {
            totalPay = totalPay + PayYear2022[i];
        }
        return totalPay;
    }
}

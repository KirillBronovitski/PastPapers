package org.example.jun202342;

public class Employee {
    private double HourlyPay;
    private String EmployeeNumber;
    private String JobTitle;
    private double[] PayYear2022 = new double[52];


    public Employee(String employeeNumber, String jobTitle, double[] payYear2022) {
        EmployeeNumber = employeeNumber;
        JobTitle = jobTitle;
        PayYear2022 = payYear2022;
    }

    public String getEmployeeNumber() {
        return EmployeeNumber;
    }

    public void SetPay(int weekNumber, double hoursWorked) {
        double paymentForTheWeek = hoursWorked * HourlyPay;
        PayYear2022[weekNumber] = paymentForTheWeek;
    }

    public double GetTotalPay() {
        double totalPay = 0;
        for (int i = 0; i < PayYear2022.length; i++) {
            totalPay = totalPay + PayYear2022[i];
        }
        return totalPay;
    }

}

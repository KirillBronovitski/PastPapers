package org.example.jun202342Done;

import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;

public class Paper5q3 {

    static Employee[] EmployeeArray = new Employee[8];


    public static void main(String[] args) throws IOException {
        double hourlyPay;
        String employeeNumber;
        double bonusValue;
        String jobTitle;
        String checkString = "";
        int index = 0;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/Employees.txt"))) {
            while (fileReader.hasNextLine()) {
                hourlyPay = Double.parseDouble(fileReader.next());
                employeeNumber = fileReader.next();
                try {
                    checkString = fileReader.next();
                    bonusValue = Double.parseDouble(checkString);
                    jobTitle = fileReader.next();
                    Manager managerInsert = new Manager(bonusValue, hourlyPay, employeeNumber, jobTitle);
                    EmployeeArray[index] = managerInsert;
                    index++;
                } catch (NumberFormatException e) {
                    jobTitle = checkString;
                    Employee employeeInsert = new Employee(hourlyPay, employeeNumber, jobTitle);
                    EmployeeArray[index] = employeeInsert;
                    index++;
                }
            }
        } catch (IOException e) {
            System.out.println("The source file had not been found or does not not exist");
        }
        EnterHours();
        for (int i = 0; i < EmployeeArray.length; i++) {
            System.out.println("Total pay of the employee " + EmployeeArray[i].EmployeeNumber + ": " + EmployeeArray[i].GetTotalPay());
        }
    }

    public static void EnterHours() throws IOException {
        String employeeNumber;
        double hoursWorked;
        try (Scanner fileReader = new Scanner(Paths.get("C:/dev/HoursWeek1.txt"))) {
            while (fileReader.hasNextLine()) {
                employeeNumber = fileReader.next();
                hoursWorked = Double.parseDouble(fileReader.next());
                for (int i = 0; i < EmployeeArray.length; i++) {
                    if (EmployeeArray[i].EmployeeNumber.equals(employeeNumber)) {
                        EmployeeArray[i].SetPay(1, hoursWorked);
                    }
                }
            }
        }
    }

}
